package cn.under2;

import cn.under2.constant.Const;
import cn.under2.generate.DefaultMdGenerate;
import cn.under2.generate.MdGenerate;
import cn.under2.model.DbSourceConfig;


public class MdUtil {

    /**
     * 根据数据源配置，进行markdown文件生成
     *
     * @param config 数据源配置
     * @throws Exception 异常
     */
    public static void db2md(DbSourceConfig config) throws Exception {
        MdGenerate mdGenerate = new DefaultMdGenerate();
        mdGenerate.generate(config);
        System.out.println("文件生成完成,目录为" + Const.OUTPUT_FILE);
    }
}
