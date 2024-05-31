package cn.under2.generate;

import cn.under2.model.*;
import cn.hutool.core.collection.CollUtil;
import cn.under2.config.DbConfig;
import cn.under2.config.DbQuery;
import cn.under2.constant.Const;
import cn.under2.model.md.ColumnModel;
import cn.under2.model.md.TableModel;

import javax.sql.DataSource;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;


/**
 * 生成markdown文件
 */
public class DefaultMdGenerate implements MdGenerate {


    @Override
    public void generate(DbSourceConfig config) throws Exception {
        generate(config, MdColumnConfig.DEFAULT_TABLE_CONFIG, MdColumnConfig.DEFAULT_COLUMN_CONFIG);

    }

    @Override
    public void generate(DbSourceConfig config, List<MdColumnItem> tableConfig, List<MdColumnItem> tableColumnConfig) throws Exception {
        DataSource dataSource = DbConfig.customDataSource(config);
        DbModel dbModel = DbQuery.queryModel(dataSource);

        List<TableModel> tables = dbModel.getTables();

        StringBuilder res = new StringBuilder();
        List<String> tTitle = tableConfig.stream().map(MdColumnItem::getMdColumn).collect(Collectors.toList());
        res.append(arrToMdTableLine(tTitle));
        res.append(arrToMdTableConnectLine(tTitle.size()));

        for (TableModel t : tables) {
            List<String> temp = new ArrayList<>();
            for (MdColumnItem th : tableConfig) {
                Object o = invokeField(TableModel.class, th.getDbColumn(), t);
                temp.add(nullToBlank(o));
            }
            res.append(arrToMdTableLine(temp));
        }

        List<String> cTitle = tableColumnConfig.stream().map(MdColumnItem::getMdColumn).collect(Collectors.toList());

        for (TableModel t : tables) {
            res.append(Const.FOUR_LEVEL_TITLE).append(t.getTableName()).append(Const.LINE_SEPARATOR);
            res.append(arrToMdTableLine(cTitle));
            res.append(arrToMdTableConnectLine(cTitle.size()));
            for (ColumnModel c : t.getColumns()) {
                List<String> temp = new ArrayList<>();
                for (MdColumnItem th : tableColumnConfig) {
                    Object o = invokeField(ColumnModel.class, th.getDbColumn(), c);
                    temp.add(nullToBlank(o));
                }
                res.append(arrToMdTableLine(temp));
            }
            res.append(Const.LINE_SEPARATOR);
        }

        FileWriter writer = new FileWriter(Const.OUTPUT_FILE);
        writer.write(res.toString());
        writer.flush();
        writer.close();
    }

    @Override
    public void generate(DbSourceConfig config, List<MdColumnItem> tableColumnConfig) throws Exception {
        generate(config, MdColumnConfig.DEFAULT_COLUMN_CONFIG);

    }

    public static Object invokeField(Class<?> clazz, String fieldName, Object obj) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    public static String nullToBlank(Object o) {
        return o == null ? "" : o.toString();
    }

    public static String arrToMdTableLine(List<String> list) {
        if (CollUtil.isEmpty(list)) {
            return "| |" + Const.LINE_SEPARATOR;
        } else {
            return "| " + String.join(" | ", list) + " |" + Const.LINE_SEPARATOR;
        }
    }

    public static String arrToMdTableConnectLine(int size) {
        if (size == 0 || size == 1) {
            return "| --- |" + Const.LINE_SEPARATOR;
        } else {
            return " | " + "--- | ".repeat(Math.max(0, size)) + Const.LINE_SEPARATOR;
        }
    }

}
