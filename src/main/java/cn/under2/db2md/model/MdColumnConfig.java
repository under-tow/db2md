package cn.under2.db2md.model;

import java.util.List;

/**
 * markdown模板配置
 */
public class MdColumnConfig {

    /**
     * 默认字段生成配置 ,样例如下
     * | 名称 | 数据类型 | 列大小 | 允许空值 | 默认值 | 备注 |
     *  | --- | --- | --- | --- | --- | --- |
     * | updated_by_id | uuid | 2147483647 | YES |  | 更新人ID |
     */
    public static final List<MdColumnItem> DEFAULT_COLUMN_CONFIG = List.of(
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
    public static final List<MdColumnItem> DEFAULT_TABLE_CONFIG = List.of(
            MdColumnItem.of("模式", "TABLE_SCHEM"),
            MdColumnItem.of("表名", "TABLE_NAME"),
            MdColumnItem.of("说明", "REMARKS")

    );
//
//    private static List<MdColumnItem> customConfig = new ArrayList<>();
//
//    public static List<MdColumnItem> getDefaultConfig() {
//        return customConfig.isEmpty() ? DEFAULT_CONFIG : customConfig;
//    }
}
