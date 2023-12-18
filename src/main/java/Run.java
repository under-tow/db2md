import generate.AnnotationMdGenerate;
import generate.FreemarkerMdGenerate;
import generate.MdGenerate;


public class Run {

    public static void main(String[] args) throws Exception {

        // 有两种方式供选择，生成结果并无差异，可以按提示位置自行修改模板或注解

        // 使用 src/main/java/model/md 中 TableModel与ColumnModel的注解配置
        MdGenerate mdGenerate = new AnnotationMdGenerate();
        mdGenerate.generate();

        // 使用 /freemarker/md.ftl 中的配置
//        MdGenerate mdGenerate = new AnnotationMdGenerate();
//        mdGenerate.generate();

    }
}
