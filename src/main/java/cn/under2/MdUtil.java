package cn.under2;

import cn.under2.generate.DefaultMdGenerate;
import cn.under2.generate.MdGenerate;
import cn.under2.model.DbSourceConfig;


public class MdUtil {

    public static void db2md(DbSourceConfig config) throws Exception {

        // 有两种方式供选择，生成结果并无差异，可以按提示位置自行修改模板或注解

        // 使用 src/main/java/cn.under2.model/md 中 TableModel与ColumnModel的注解配置
        MdGenerate mdGenerate = new DefaultMdGenerate();
        mdGenerate.generate(
                new DbSourceConfig.Builder()
                .url("jdbc:postgresql://172.18.1.54:5432/dw_pro_dev")
                .password("123456")
                .username("postgres").build()
        );

        // 使用 /freemarker/md.ftl 中的配置
//        MdGenerate mdGenerate = new AnnotationMdGenerate();
//        mdGenerate.cn.under2.generate();
    }
}
