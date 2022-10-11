package com.github.cnkeep.translation.spi.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TranslateField: 翻译字段
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/14
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TranslateField {

    /**
     * 翻译类型
     *
     * @return
     */
    Class metaType();

    /**
     * 主键字段 不能为空, 指定当前对象的某个字段名作为翻译key
     *
     * @return
     */
    String key();
}
