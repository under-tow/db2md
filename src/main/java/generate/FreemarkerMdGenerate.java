package generate;

import model.DbModel;
import config.DbConfig;
import config.DbQuery;
import constant.Const;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;


/**
 * 通过 /freemarker/md.ftl配置的列，来生成markdown文件
 */
public class FreemarkerMdGenerate implements MdGenerate {


    private final Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);

    {
        configuration.setTemplateLoader(new ClassTemplateLoader(this.getClass(), Const.TEMPLATE_DIR));
        configuration.setDefaultEncoding(Const.UTF8);
        configuration.setLocale(new Locale(Const.ZH_CN));
    }


    @Override
    public void generate() throws Exception {
        DbModel data = DbQuery.queryModel(DbConfig.getDataSource());
        Template template = configuration.getTemplate(Const.TEMPLATE_FTL);
        File file = new File(Const.OUTPUT_FILE);
        Writer out = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
        template.process(data, out);
    }


}
