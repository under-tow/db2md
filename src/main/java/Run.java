import generate.AnnotationMdGenerate;
import generate.FreemarkerMdGenerate;
import generate.MdGenerate;


public class Run {

    public static void main(String[] args) throws Exception {

        MdGenerate mdGenerate = new AnnotationMdGenerate();
//        MdGenerate mdGenerate = new AnnotationMdGenerate();
        mdGenerate.generate(null);

    }
}
