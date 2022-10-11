/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.spi.base;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * AbstractFactory
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/10/11
 */
public interface AbstractFactory<K, T> {
    /**
     * 注册
     *
     * @param key
     * @param bean
     */
    void register(K key, T bean);

    /**
     * 注销key对应的bean
     *
     * @param key
     */
    void deregister(K key);

    /**
     * 返回所有注册的bean
     *
     * @return
     */
    Map<K, T> listAll();

    /**
     * 查询key对应的bean
     *
     * @param key
     * @param defaultV
     * @return
     */
    default Optional<T> lookup(K key, T defaultV) {
        Map<K, T> all = listAll();
        if (Objects.isNull(all) || all.isEmpty()) {
            return Optional.empty();
        }

        return Optional.ofNullable(listAll().getOrDefault(key, defaultV));
    }
}
