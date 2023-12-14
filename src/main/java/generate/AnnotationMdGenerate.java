package generate;

import bean.DbModel;
import bean.TableModel;
import cn.hutool.core.annotation.AnnotationUtil;
import config.DataSourceFactory;
import config.DbQuery;
import config.MdColumn;

import java.lang.reflect.Field;

/**
 * 1. 判断tablemodel\columnmodel 类上各个字段是否有md注解
 * 2. 有注解则拿对应的、val\sort,并从dbmodel那字段
 *
 *
 */
public class AnnotationMdGenerate implements MdGenerate {
    @Override
    public void generate() throws Exception {
        DbModel data = DbQuery.modelOf(DataSourceFactory.getDataSource());
        // TODO 是否用stream优化
        for (TableModel model : data.getTables()) {
            Field[] fields = TableModel.class.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("AnnotationUtil.hasAnnotation(field,MdColumn.class) = " + AnnotationUtil.hasAnnotation(field, MdColumn.class));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        DbModel data = DbQuery.modelOf(DataSourceFactory.getDataSource());

        Field[] fields = TableModel.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field + "    " + AnnotationUtil.hasAnnotation(field, MdColumn.class));
        }
    }
}
