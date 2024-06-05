package cn.under2.db2md.constant;

import cn.under2.db2md.generate.MdColumnItem;

import java.util.List;

public class MarkdownConst {


    /** 4级标题 **/
    public static final String FOUR_LEVEL_TITLE = "#### ";

    public static final String START_VERTICAL = "| ";
    public static final String END_VERTICAL = " |";

    public static final String VERTICAL_CONNECTER = "---|";

    /** 系统换行符 **/
    public static final String LINE_SEPARATOR = System.lineSeparator();

    /** 生成的markdown文件位置 **/
    public static final String OUTPUT_FILE = System.getProperty("user.dir") + "\\datasource.md";


    /**
     * 默认字段生成配置 ,样例如下
     * | 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
     *  | --- | --- | --- | --- | --- | --- |
     * | updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
     */
    public static final List<MdColumnItem> DEFAULT_COLUMN_ITEMS = List.of(
            MdColumnItem.of("名称", "COLUMN_NAME"),
            MdColumnItem.of("数据类型", "TYPE_NAME"),
            MdColumnItem.of("列大小", "COLUMN_SIZE"),
            MdColumnItem.of("允许空值", "IS_NULLABLE"),
            MdColumnItem.of("默认值", "COLUMN_DEF"),
            MdColumnItem.of("备注", "REMARKS")
    );

    /**
     * 默认表生成配置，样例如下
     * | 模式 | 表名 | 说明 |
     *  | --- | --- | --- |
     * | public | demo |  |
     */
    public static final List<MdColumnItem> DEFAULT_TABLE_ITEMS = List.of(
            MdColumnItem.of("模式", "TABLE_SCHEM"),
            MdColumnItem.of("表名", "TABLE_NAME"),
            MdColumnItem.of("说明", "REMARKS")

    );
}


