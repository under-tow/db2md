package config;

import bean.ColumnModel;
import bean.DbModel;
import bean.TableModel;
import cn.hutool.core.util.StrUtil;
import constant.Const;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbQuery {

    public static void cols(Connection connection, DbModel dbModel, String table) throws SQLException, NoSuchFieldException, IllegalAccessException {
        DatabaseMetaData metaData = connection.getMetaData();

        ResultSet resultSet = metaData.getColumns(connection.getCatalog(), connection.getSchema(), table, null);
        // TODO filter
        TableModel tableModel = dbModel.getTables().stream().filter(it -> it.getTableName().equals(table)).findFirst().orElse(null);
        while (resultSet.next()) {
            ColumnModel columnModel = new ColumnModel();
            for (String dbField : Const.columnFieldSet) {

                String val = resultSet.getString(dbField);
                String fieldName = StrUtil.toCamelCase(dbField.toLowerCase());

                Class<?> cls = columnModel.getClass();
                Field field1 = cls.getDeclaredField(fieldName);
                field1.setAccessible(true); // 设置为可访问
                field1.set(columnModel, val); // 为实体类对象设置字段值
            }

            tableModel.getColumns().add(columnModel);
        }
    }

    public static DbModel tables(Connection connection) throws Exception {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet =
                metaData.getTables(connection.getCatalog(), connection.getSchema(), null, new String[]{"TABLE"});

        DbModel dbModel = new DbModel();
        while (resultSet.next()) {
            TableModel tableModel = new TableModel();

            for (String dbField : Const.tableFieldSet) {

                String val = resultSet.getString(dbField);
                String fieldName = StrUtil.toCamelCase(dbField.toLowerCase());

                Class<?> cls = tableModel.getClass();
                Field field1 = cls.getDeclaredField(fieldName);
                field1.setAccessible(true); // 设置为可访问
                field1.set(tableModel, val); // 为实体类对象设置字段值
            }
            dbModel.getTables().add(tableModel);
            cols(connection, dbModel, tableModel.getTableName());
        }
        return dbModel;
    }

    public static DbModel modelOf(DataSource dataSource) throws Exception {
        return tables(dataSource.getConnection());
    }
}
