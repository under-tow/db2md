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
        configuration.setTemplateLoader(new ClassTemplateLoader(this.getClass(), "/freemarker/"));
        configuration.setDefaultEncoding("UTF-8");
        configuration.setLocale(new Locale("zh_CN"));
    }


    @Override
    public void generate(Object obj) throws Exception {

        DbModel data = DbQuery.queryModel(DataSourceFactory.getDataSource());
        Template template = configuration.getTemplate("md.ftl");
        System.out.println("Const.OUTPUT_FILE = " + Const.OUTPUT_FILE);
        File file = new File(Const.OUTPUT_FILE);
        file.createNewFile();
        Writer out = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
        template.process(data, out);
    }


}
