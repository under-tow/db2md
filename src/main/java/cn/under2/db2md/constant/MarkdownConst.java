package cn.under2.db2md.constant;


/**
 * 常量
 */
public class MarkdownConst {

    public static final String UTF8 = "utf-8";

    public static final String ZH_CN = "zh_CN";

    /** freemarker模板名称 **/
    public static final String TEMPLATE_FTL = "md.ftl";

    /** freemarker模板resource目录下的位置 **/

    public static final String TEMPLATE_DIR = "/freemarker/";

    /** 4级标题 **/
    public static final String FOUR_LEVEL_TITLE = "#### ";

    public static final String TABLE_CONTENT_SEPARATOR = "|";
    public static final String VERTICAL = "|";
    public static final String START_VERTICAL = "| ";
    public static final String END_VERTICAL = " |";

    public static final String VERTICAL_CONNECTER = "---|";

    /** 系统换行符 **/
    public static final String LINE_SEPARATOR = System.lineSeparator();

    /** 生成的markdown文件位置 **/
    public static final String OUTPUT_FILE = System.getProperty("user.dir") + "\\datasource.md";
}


