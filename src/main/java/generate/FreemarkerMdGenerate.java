package generate;

import bean.DbModel;
import config.DataSourceFactory;
import config.DbQuery;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Locale;

public class FreemarkerMdGenerate implements MdGenerate {


    private final Configuration configuration = new Configuration(
            Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);

    {
        configuration.setTemplateLoader(
                new ClassTemplateLoader(this.getClass(), "/freemarker/"));
        //编码
        configuration.setDefaultEncoding("UTF-8");
        //国际化
        configuration.setLocale(new Locale("zh_CN"));
    }


    @Override
    public void generate(Object obj) throws Exception {

        DbModel data = DbQuery.queryModel(DataSourceFactory.getDataSource());
        Template template = configuration.getTemplate("md2.ftl");
        // TODO 系统相对目录
        File file = new File("D:\\project\\db2md\\src\\main\\resources\\out2.md");
        Writer out = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
        template.process(obj, out);
    }
}
