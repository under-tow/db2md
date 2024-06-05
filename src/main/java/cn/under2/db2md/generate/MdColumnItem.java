package cn.under2.db2md.generate;


import lombok.Getter;

import java.sql.DatabaseMetaData;

@Getter
public class MdColumnItem {

    /**
     * 在生成的markdown中显示列名称
     **/
    private final String mdColumn;

    /**
     * 对于表展示中，可选的dbColumn可以参考这里 {@link DatabaseMetaData#getTables(String, String, String, String[])}
     * 对于字段展示中，可选的dbColumn可以参考这里 {@link DatabaseMetaData#getColumns(String, String, String, String)}
     **/
    private final String dbColumn;

    private MdColumnItem(String mdColumn, String dbColumn) {
        this.mdColumn = mdColumn;
        this.dbColumn = dbColumn;
    }

    public static MdColumnItem of(String mdColumn, String dbColumn) {
        return new MdColumnItem(mdColumn, dbColumn);
    }

}
