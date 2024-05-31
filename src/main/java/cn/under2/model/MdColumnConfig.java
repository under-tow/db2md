package cn.under2.model;

import lombok.Data;

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
            MdColumnItem.of("名称", "columnName"),
            MdColumnItem.of("数据类型", "typeName"),
            MdColumnItem.of("列大小", "columnSize"),
            MdColumnItem.of("允许空值", "isNullable"),
            MdColumnItem.of("默认值", "columnDef"),
            MdColumnItem.of("备注", "remarks")
    );

    /**
     * 默认表生成配置，样例如下
     * | 模式 | 表名 | 说明 |
     *  | --- | --- | --- |
     * | public | demo |  |
     */
    public static final List<MdColumnItem> DEFAULT_TABLE_CONFIG = List.of(
            MdColumnItem.of("模式", "tableSchem"),
            MdColumnItem.of("表名", "tableName"),
            MdColumnItem.of("说明", "remarks")

    );
//
//    private static List<MdColumnItem> customConfig = new ArrayList<>();
//
//    public static List<MdColumnItem> getDefaultConfig() {
//        return customConfig.isEmpty() ? DEFAULT_CONFIG : customConfig;
//    }
}
