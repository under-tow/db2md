package config;

import model.md.ColumnModel;
import model.DbModel;
import model.md.TableModel;
import cn.hutool.core.util.StrUtil;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 根据数据库连接读取表结构
 */
public class DbQuery {

    public static DbModel queryModel(DataSource dataSource) throws Exception {
        return tables(dataSource.getConnection());
    }

    public static void cols(Connection connection, TableModel tableModel, String table) throws SQLException, NoSuchFieldException, IllegalAccessException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getColumns(connection.getCatalog(), connection.getSchema(), table, null);

        while (resultSet.next()) {
            ColumnModel columnModel = new ColumnModel();
            for (Field field : ColumnModel.class.getDeclaredFields()) {
                setField(resultSet, columnModel, field);
            }
            tableModel.getColumns().add(columnModel);
        }
    }

    public static DbModel tables(Connection connection) throws Exception {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getTables(connection.getCatalog(), connection.getSchema(), null, new String[]{"TABLE"});

        DbModel dbModel = new DbModel();

        while (resultSet.next()) {
            TableModel tableModel = new TableModel();
            for (Field field : TableModel.class.getDeclaredFields()) {
                if(field.getType() == String.class){
                    setField(resultSet, tableModel, field);
                }
            }
            dbModel.getTables().add(tableModel);
            cols(connection, tableModel, tableModel.getTableName());
        }

        return dbModel;
    }

    private static void setField(ResultSet resultSet, Object obj, Field field) throws IllegalAccessException, SQLException {
        String dbField = StrUtil.toUnderlineCase(field.getName()).toUpperCase();
        String val = resultSet.getString(dbField);
        field.setAccessible(true);
        field.set(obj, val);
    }

}
