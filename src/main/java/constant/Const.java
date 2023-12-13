package constant;

import java.util.HashSet;

public class Const {

    public static final String THREE_LEVEL_TITLE = "###";
    public static final String FOUR_LEVEL_TITLE = "####";
    public static final String TABLE_CONTENT_SEPARATOR = "|";
    public static final String TABLE_HEADER_SEPARATOR = "----";

    public static final HashSet<String> tableFieldSet = new HashSet<>();
    public static final HashSet<String> columnFieldSet = new HashSet<>();

    static {
        tableFieldSet.add("TABLE_CAT");
        tableFieldSet.add("TABLE_SCHEM");
        tableFieldSet.add("TABLE_NAME");
        tableFieldSet.add("TABLE_TYPE");
        tableFieldSet.add("REMARKS");
        tableFieldSet.add("TYPE_CAT");
        tableFieldSet.add("TYPE_SCHEM");
        tableFieldSet.add("TYPE_NAME");
        tableFieldSet.add("SELF_REFERENCING_COL_NAME");
        tableFieldSet.add("REF_GENERATION");

        columnFieldSet.add("TABLE_CAT");
        columnFieldSet.add("TABLE_SCHEM");
        columnFieldSet.add("TABLE_NAME");
        columnFieldSet.add("COLUMN_NAME");
        columnFieldSet.add("DATA_TYPE");
        columnFieldSet.add("TYPE_NAME");
        columnFieldSet.add("COLUMN_SIZE");
        columnFieldSet.add("DECIMAL_DIGITS");
        columnFieldSet.add("NUM_PREC_RADIX");
        columnFieldSet.add("NULLABLE");
        columnFieldSet.add("REMARKS");
        columnFieldSet.add("COLUMN_DEF");
        columnFieldSet.add("SQL_DATA_TYPE");
        columnFieldSet.add("SQL_DATETIME_SUB");
        columnFieldSet.add("CHAR_OCTET_LENGTH");
        columnFieldSet.add("ORDINAL_POSITION");
        columnFieldSet.add("IS_NULLABLE");
        columnFieldSet.add("SCOPE_CATALOG");
        columnFieldSet.add("SCOPE_SCHEMA");
        columnFieldSet.add("SCOPE_TABLE");
        columnFieldSet.add("SOURCE_DATA_TYPE");
        columnFieldSet.add("IS_AUTOINCREMENT");
        columnFieldSet.add("IS_GENERATEDCOLUMN");
    }
}


