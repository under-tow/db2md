package cn.under2.db2md.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * markdown文档注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MdColumn {

    /**
     * 列标题
     */
    String name();

    /**
     * 顺序，较小的排在前面
     */
    int sort();
}