package generate;

import bean.*;
import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.util.StrUtil;
import config.DataSourceFactory;
import config.DbQuery;
import config.MdColumn;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 1. 判断tablemodel\columnmodel 类上各个字段是否有md注解
 * 2. 有注解则拿对应的、val\sort,并从dbmodel那字段
 * 3. 如何写md文件
 *
 * 4. 因为包含注解的个数、以及注解的内容是动态的，所以必须在新的实体类来实现对应md2.ftl
 */
public class AnnotationMdGenerate implements MdGenerate {
    @Override
    public void generate(Object obj) throws Exception {
        DbModel dbModel = DbQuery.queryModel(DataSourceFactory.getDataSource());

        // 表头
        List<TableHeader> tableHeaders = rows(TableModel.class);
        List<TableHeader> columnHeaders = rows(ColumnModel.class);
        List<List<String>> tiContent =  new ArrayList<>();
        List<List<String>> tdContent =  new ArrayList<>();

        // 表数据
        for (TableModel table : dbModel.getTables()) {
            List<String> arr = new ArrayList<>();
            for (TableHeader header : tableHeaders) {
                Field field = TableModel.class.getDeclaredField(header.getFiledName());
                field.setAccessible(true);
                Object o = field.get(table);
                arr.add(StrUtil.toStringOrNull(o));
            }
            tiContent.add(arr);
        }

        for (TableModel table : dbModel.getTables()) {
            for (ColumnModel column : table.getColumns()) {
                List<String> arr = new ArrayList<>();
                for (TableHeader header : columnHeaders) {
                    Field field = ColumnModel.class.getDeclaredField(header.getFiledName());
                    field.setAccessible(true);
                    Object o = field.get(column);
                    arr.add(StrUtil.toStringOrNull(o));
                }
                tdContent.add(arr);
            }
        }

        MdModel mdModel = new MdModel();
        mdModel.setTiHeader(tableHeaders);
        mdModel.setTdHeader(columnHeaders);
        mdModel.setTiContent(tiContent);
        mdModel.setTdContent(tdContent);

        FreemarkerMdGenerate freemarkerMdGenerate = new FreemarkerMdGenerate();
        freemarkerMdGenerate.generate(mdModel);

    }

    public static List<TableHeader> rows(Class<?> clazz) {
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

    public static void main(String[] args) throws Exception {
        DbModel dbModel = DbQuery.queryModel(DataSourceFactory.getDataSource());

        // 表头
        List<TableHeader> tableHeaders = rows(TableModel.class);
        List<TableHeader> columnHeaders = rows(ColumnModel.class);
        List<List<String>> tiContent =  new ArrayList<>();
        List<List<String>> tdContent =  new ArrayList<>();

        // 表数据
        for (TableModel table : dbModel.getTables()) {
            List<String> arr = new ArrayList<>();
            for (TableHeader header : tableHeaders) {
                Field field = TableModel.class.getDeclaredField(header.getFiledName());
                field.setAccessible(true);
                Object o = field.get(table);
                arr.add(StrUtil.toStringOrNull(o));
            }
            tiContent.add(arr);
        }

        for (TableModel table : dbModel.getTables()) {
            for (ColumnModel column : table.getColumns()) {
                List<String> arr = new ArrayList<>();
                for (TableHeader header : columnHeaders) {
                    Field field = ColumnModel.class.getDeclaredField(header.getFiledName());
                    field.setAccessible(true);
                    Object o = field.get(column);
                    arr.add(StrUtil.toStringOrNull(o));
                }
                tdContent.add(arr);
            }
        }

    }
}
