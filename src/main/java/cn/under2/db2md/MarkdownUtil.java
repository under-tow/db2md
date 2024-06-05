package cn.under2.db2md;

import cn.under2.db2md.constant.MarkdownConst;
import cn.under2.db2md.generate.DefaultMdGenerate;
import cn.under2.db2md.generate.MdGenerate;
import cn.under2.db2md.db.DbSourceConfig;
import cn.under2.db2md.generate.MdColumnItem;

import java.util.List;

/***
 * Markdown文档生成工具
 * @author undertow
 */
public class MarkdownUtil {

    /**
     * 根据数据源配置，进行markdown文件生成
     *
     * @param config 数据源配置
     * @throws Exception 文件生成异常
     */
    public static void db2md(DbSourceConfig config) throws Exception {
        MdGenerate mdGenerate = new DefaultMdGenerate();
        mdGenerate.generate(config);
    }


    /**
     * 根据数据源配置，进行markdown文件生成
     * @param config 数据源配置
     * @param tableConfig 表打印配置
     * @param tableColumnConfig 字段打印配置
     * @throws Exception 文件生成异常
     */
    public static void db2md(DbSourceConfig config, List<MdColumnItem> tableConfig, List<MdColumnItem> tableColumnConfig) throws Exception {
        MdGenerate mdGenerate = new DefaultMdGenerate();
        mdGenerate.generate(config, tableConfig, tableColumnConfig);
    }

}
