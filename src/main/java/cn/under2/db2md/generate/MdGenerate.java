package cn.under2.db2md.generate;

import cn.under2.db2md.model.DbSourceConfig;
import cn.under2.db2md.model.MdColumnItem;

import java.util.List;

public interface MdGenerate {

    /**
     * 根据数据源配置，进行markdown文件生成
     * @param config 数据源配置
     * @throws Exception 异常
     */
    void generate(DbSourceConfig config) throws Exception;

    /**
     * 根据数据源配置，”表“展示配置，”字段“展示配置 ，进行markdown文件生成
     * @param config 数据源配置
     * @param tableConfig ”表“展示配置
     * @param tableColumnConfig ”字段“展示配置
     * @throws Exception 异常
     */
    void generate(DbSourceConfig config, List<MdColumnItem> tableConfig,List<MdColumnItem> tableColumnConfig) throws Exception;


    /**
     * 根据数据源配置，”表“展示配置，”字段“展示配置 ，进行markdown文件生成
     * @param config 数据源配置
     * @param tableColumnConfig ”字段“展示配置
     * @throws Exception 异常
     */
    void generate(DbSourceConfig config, List<MdColumnItem> tableColumnConfig) throws Exception;
}
