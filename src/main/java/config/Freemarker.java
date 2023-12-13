package config;

import bean.DbModel;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.Locale;

public class Freemarker {

    private final Configuration configuration = new Configuration(
            Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);

    {
        configuration.setTemplateLoader(
                new ClassTemplateLoader(this.getClass(), "/template/freemarker/"));
        //编码
        configuration.setDefaultEncoding("UTF-8");
        //国际化
        configuration.setLocale(new Locale("zh_CN"));
    }

    public void produce(DbModel dbModel) throws IOException, TemplateException {
        Template template = configuration.getTemplate("md.ftl");
        // create file
        File file = new File("D:\\project\\db2md\\src\\main\\resources\\out.md");
        // writer freemarker
        Writer out = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
        // process
        template.process(dbModel, out);
        // open the output directory

    }
}