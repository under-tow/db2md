import generate.FreemarkerMdGenerate;
import generate.MdGenerate;


public class Run {

    public static void main(String[] args) throws Exception {

        MdGenerate mdGenerate = new FreemarkerMdGenerate();
        mdGenerate.generate();

    }
}
