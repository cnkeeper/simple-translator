
package com.github.cnkeep.translation.spi.core.key;

import net.jcip.annotations.ThreadSafe;

/**
 * KeyGenerator： 生成翻译Key的生成器，需保证线程安全
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/30
 */
@ThreadSafe
public interface KeyGenerator {
    /**
     * 生成key
     *
     * @param originKey   原始key
     * @param targetClass 原始key对应的class
     * @return
     */
    String generate(String originKey, Class targetClass);

    /**
     * 策略标示
     * @return
     */
    String strategy();
}
