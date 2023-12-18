package generate;

import bean.DbModel;
import config.DataSourceFactory;
import config.DbQuery;
import constant.Const;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Locale;

public class FreemarkerMdGenerate implements MdGenerate {


    private final Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);

    {
        configuration.setTemplateLoader(new ClassTemplateLoader(this.getClass(), Const.TEMPLATE_DIR));
        configuration.setDefaultEncoding(Const.UTF8);
        configuration.setLocale(new Locale(Const.ZH_CN));
    }


    @Override
    public void generate(Object obj) throws Exception {
        DbModel data = DbQuery.queryModel(DataSourceFactory.getDataSource());
        Template template = configuration.getTemplate(Const.TEMPLATE_FTL);
        File file = new File(Const.OUTPUT_FILE);
        Writer out = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(file), Const.UTF8));
        template.process(data, out);
    }


}
