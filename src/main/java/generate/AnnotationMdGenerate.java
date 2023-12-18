package generate;

import bean.*;
import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.collection.CollUtil;
import config.DataSourceFactory;
import config.DbQuery;
import config.MdColumn;
import constant.Const;

import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;


public class AnnotationMdGenerate implements MdGenerate {


    @Override
    public void generate(Object obj) throws Exception {
        DbModel dbModel = DbQuery.queryModel(DataSourceFactory.getDataSource());

        List<TableHeader> tableHeaders = getMdColumns(TableModel.class);
        List<TableHeader> columnHeaders = getMdColumns(ColumnModel.class);

        List<TableModel> tables = dbModel.getTables();

        StringBuilder res = new StringBuilder();
        List<String> tTitle = tableHeaders.stream().map(TableHeader::getColumnName).collect(Collectors.toList());
        res.append(arrToMdTableLine(tTitle));
        res.append(arrToMdTableConnectLine(tTitle.size()));

        for (TableModel t : tables) {
            List<String> temp = new ArrayList<>();
            for (TableHeader th : tableHeaders) {
                Object o = invokeField(TableModel.class,th.getFiledName(), t);
                temp.add(nullToBlank(o));
            }
            res.append(arrToMdTableLine(temp));
        }

        List<String> cTitle = columnHeaders.stream().map(TableHeader::getColumnName).collect(Collectors.toList());

        for (TableModel t : tables) {
            res.append(Const.FOUR_LEVEL_TITLE).append(t.getTableName()).append(Const.LINE_SEPARATOR);
            res.append(arrToMdTableLine(cTitle));
            res.append(arrToMdTableConnectLine(cTitle.size()));
            for (ColumnModel c : t.getColumns()) {
                List<String> temp = new ArrayList<>();
                for (TableHeader th : columnHeaders) {
                    Object o = invokeField(ColumnModel.class,th.getFiledName(), c);
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

    public static List<TableHeader> getMdColumns(Class<?> clazz) {
        List<TableHeader> rows = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            MdColumn annotation;
            if ((annotation = AnnotationUtil.getAnnotation(field, MdColumn.class)) != null) {
                TableHeader row = new TableHeader();
                row.setFiledName(field.getName());
                row.setColumnName(annotation.name());
                row.setSort(annotation.sort());
                rows.add(row);
            }
        }
        rows.sort((Comparator.comparingInt(TableHeader::getSort)));
        return rows;
    }


    public static Object invokeField(Class<?> clazz,String fieldName, Object obj) throws NoSuchFieldException, IllegalAccessException {
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
