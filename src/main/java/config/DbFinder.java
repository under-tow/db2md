package config;

import bean.ColumnModel;
import bean.DbModel;
import bean.TableModel;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbFinder {

    public static void cols(Connection connection, DbModel dbModel, String table) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();

        ResultSet resultSet = metaData.getColumns(connection.getCatalog(), connection.getSchema(), table, null);
        TableModel tableModel = dbModel.getTables().stream().filter(it -> it.getTableName().equals(table)).findFirst().orElse(null);
        while (resultSet.next()) {
            String columnName = resultSet.getString("COLUMN_NAME");
            String dataType = resultSet.getString("DATA_TYPE");
            String typeName = resultSet.getString("TYPE_NAME");
            String nullable = resultSet.getString("IS_NULLABLE");
            String remarks = resultSet.getString("REMARKS");
            String columnSize = resultSet.getString("COLUMN_SIZE");
            String columnDef = resultSet.getString("COLUMN_DEF");
            // 处理表名和表模式
            ColumnModel columnModel =
                    ColumnModel.builder().columnName(columnName).dataType(dataType).typeName(typeName).nullable(nullable).remarks(remarks)
                            .columnSize(columnSize).columnDef(columnDef).build();
            tableModel.getColumns().add(columnModel);

        }
    }

    public static DbModel tables(Connection connection) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet =
                metaData.getTables(connection.getCatalog(), connection.getSchema(), null, new String[]{"TABLE"});

        DbModel dbModel = new DbModel();

        while (resultSet.next()) {
            String tableName = resultSet.getString("TABLE_NAME");
            String tableSchema = resultSet.getString("TABLE_SCHEM");
            String remarks = resultSet.getString("REMARKS");
            dbModel.getTables().add(new TableModel(tableName, tableSchema, remarks));
            cols(connection, dbModel, tableName);
        }
        return dbModel;
    }
}
