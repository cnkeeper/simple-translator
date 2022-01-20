
package com.github.cnkeep.translation.spi.application;

/**
 * KeyGenerator
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/30
 */
public interface KeyGenerator {
    /**
     * 生成key
     * @param originKey 原始key
     * @param targetClass 原始key对应的class
     * @return
     */
    String generate(String originKey, Class targetClass);
}
