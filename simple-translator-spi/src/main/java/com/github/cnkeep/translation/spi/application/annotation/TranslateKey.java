package com.github.cnkeep.translation.spi.application.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TranslateKey: 指定翻译key的生成策略
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/14
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TranslateKey {

    /**
     * 目标对象class
     *
     * @return
     */
    Class targetClass() default Void.class;

    TranslateKeyStrategy strategy() default TranslateKeyStrategy.APPEND_PREFIX;

    enum TranslateKeyStrategy {
        /**
         * 增加前缀
         */
        APPEND_PREFIX;
    }
}
