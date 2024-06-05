package cn.under2.db2md.generate;

import cn.hutool.core.util.StrUtil;
import cn.under2.db2md.model.DbModel;
import cn.under2.db2md.db.DbSourceConfig;
import cn.hutool.core.collection.CollUtil;
import cn.under2.db2md.db.CustomDataSource;
import cn.under2.db2md.db.DbQuery;
import cn.under2.db2md.constant.MarkdownConst;
import cn.under2.db2md.model.ColumnModel;
import cn.under2.db2md.model.TableModel;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import static cn.under2.db2md.constant.MarkdownConst.*;


/**
 * 生成markdown文件
 */
public class DefaultMdGenerate implements MdGenerate {


    @Override
    public void generate(DbSourceConfig config) throws Exception {
        generate(config, DEFAULT_TABLE_ITEMS, DEFAULT_COLUMN_ITEMS);

    }

    @Override
    public void generate(DbSourceConfig config, List<MdColumnItem> tableItems, List<MdColumnItem> columnItems) throws Exception {
        DbModel dbModel = DbQuery.queryModel(CustomDataSource.applyConfig(config));
        String markdownContent = parseMarkdownContent(tableItems, columnItems, dbModel.getTables());
        contentToFile(markdownContent);
        System.out.println("the markdown output file is " + MarkdownConst.OUTPUT_FILE);
    }

    private void contentToFile(String content) throws IOException {
        FileWriter writer = new FileWriter(MarkdownConst.OUTPUT_FILE);
        writer.write(content);
        writer.flush();
        writer.close();
    }

    private String parseMarkdownContent(List<MdColumnItem> tableItems, List<MdColumnItem> columnItems, List<TableModel> tables) throws NoSuchFieldException, IllegalAccessException {
        StringBuilder res = new StringBuilder();
        if (!tableItems.isEmpty()) {
            List<String> tTitle = tableItems.stream().map(MdColumnItem::getMdColumn).collect(Collectors.toList());
            res.append(arrToMdTableLine(tTitle));
            res.append(arrToMdTableConnectLine(tTitle.size()));
            for (TableModel t : tables) {
                List<String> temp = new ArrayList<>();
                for (MdColumnItem th : tableItems) {
                    Object o = invokeField(TableModel.class, th.getDbColumn(), t);
                    temp.add(nullToBlank(o));
                }
                res.append(arrToMdTableLine(temp));
            }
        }

        if (!columnItems.isEmpty()) {
            List<String> cTitle = columnItems.stream().map(MdColumnItem::getMdColumn).collect(Collectors.toList());
            for (TableModel t : tables) {
                res.append(FOUR_LEVEL_TITLE).append(t.getTableName()).append(LINE_SEPARATOR);
                res.append(arrToMdTableLine(cTitle));
                res.append(arrToMdTableConnectLine(cTitle.size()));
                for (ColumnModel c : t.getColumns()) {
                    List<String> temp = new ArrayList<>();
                    for (MdColumnItem th : columnItems) {
                        Object o = invokeField(ColumnModel.class, th.getDbColumn(), c);
                        temp.add(nullToBlank(o));
                    }
                    res.append(arrToMdTableLine(temp));
                }
                res.append(LINE_SEPARATOR);
            }
        }
        return res.toString();
    }

    @Override
    public void generate(DbSourceConfig config, List<MdColumnItem> tableColumnConfig)  {
        generate(config, DEFAULT_COLUMN_ITEMS);

    }

    public static Object invokeField(Class<?> clazz, String fieldName, Object obj) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(StrUtil.toCamelCase(fieldName.toLowerCase()));
        field.setAccessible(true);
        return field.get(obj);
    }

    public static String nullToBlank(Object o) {
        return o == null ? "" : o.toString();
    }

    public static String arrToMdTableLine(List<String> list) {
        if (CollUtil.isNotEmpty(list)) {
            return START_VERTICAL +
                    String.join("|", list) +
                    END_VERTICAL +
                    LINE_SEPARATOR;
        }
        return "";
    }

    public static String arrToMdTableConnectLine(int size) {
        if (size > 0) {
            return START_VERTICAL + VERTICAL_CONNECTER.repeat(size) + LINE_SEPARATOR;
        }
        return "";
    }

}
