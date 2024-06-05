package cn.under2;

import cn.under2.db2md.MarkdownUtil;
import cn.under2.db2md.model.DbSourceConfig;
import cn.under2.db2md.model.MdColumnConfig;
import cn.under2.db2md.model.MdColumnItem;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UnitTest {


    @Test
    public void testGenerate() throws Exception {
        DbSourceConfig sourceConfig = DbSourceConfig.builder()
                .jdbcUrl("jdbc:postgresql://ip:5432/x")
                .password("123456")
                .driverClassName("org.postgresql.Driver")
                .username("postgres").build();
        List<MdColumnItem> colItems = List.of(
                MdColumnItem.of("TABLE_CAT", "TABLE_CAT"),
                MdColumnItem.of("TABLE_SCHEM", "TABLE_SCHEM"),
                MdColumnItem.of("TABLE_NAME", "TABLE_NAME"),
                MdColumnItem.of("COLUMN_NAME", "COLUMN_NAME"),
                MdColumnItem.of("DATA_TYPE", "DATA_TYPE"),
                MdColumnItem.of("TYPE_NAME", "TYPE_NAME"),
                MdColumnItem.of("COLUMN_SIZE", "COLUMN_SIZE"),
                MdColumnItem.of("DECIMAL_DIGITS", "DECIMAL_DIGITS"),
                MdColumnItem.of("NUM_PREC_RADIX", "NUM_PREC_RADIX"),
                MdColumnItem.of("NULLABLE", "NULLABLE"),
                MdColumnItem.of("REMARKS", "REMARKS"),
                MdColumnItem.of("COLUMN_DEF", "COLUMN_DEF"),
                MdColumnItem.of("SQL_DATA_TYPE", "SQL_DATA_TYPE"),
                MdColumnItem.of("SQL_DATETIME_SUB", "SQL_DATETIME_SUB"),
                MdColumnItem.of("CHAR_OCTET_LENGTH", "CHAR_OCTET_LENGTH"),
                MdColumnItem.of("ORDINAL_POSITION", "ORDINAL_POSITION"),
                MdColumnItem.of("IS_NULLABLE", "IS_NULLABLE"),
                MdColumnItem.of("SCOPE_CATALOG", "SCOPE_CATALOG"),
                MdColumnItem.of("SCOPE_SCHEMA", "SCOPE_SCHEMA"),
                MdColumnItem.of("SCOPE_TABLE", "SCOPE_TABLE"),
                MdColumnItem.of("SOURCE_DATA_TYPE", "SOURCE_DATA_TYPE"),
                MdColumnItem.of("IS_AUTOINCREMENT", "IS_AUTOINCREMENT"),
                MdColumnItem.of("IS_GENERATEDCOLUMN", "IS_GENERATEDCOLUMN")
        );
        MarkdownUtil.db2md(sourceConfig,MdColumnConfig.DEFAULT_TABLE_CONFIG,colItems);
    }
}
