package cn.under2.model;


import lombok.Getter;

@Getter
public class MdColumnItem {

    /** 在生成的markdown中显示列名称 **/
    private final String mdColumn;

    /** 在数据库中字段名称 **/
    private final String dbColumn;

    private MdColumnItem(String mdColumn, String dbColumn) {
        this.mdColumn = mdColumn;
        this.dbColumn = dbColumn;
    }

    public static  MdColumnItem of(String mdColumn, String dbColumn) {
        return new MdColumnItem(mdColumn, dbColumn);
    }

}
