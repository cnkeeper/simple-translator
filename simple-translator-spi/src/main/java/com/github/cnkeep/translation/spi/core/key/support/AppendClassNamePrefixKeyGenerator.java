/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.spi.core.key.support;

import com.github.cnkeep.translation.spi.core.key.KeyGenerator;

/**
 * AppendClassNamePrefixKeyGenerator: 追加classname前缀的方式生成key
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/14
 */
public class AppendClassNamePrefixKeyGenerator implements KeyGenerator {
    public static final String KEY_GENERATOR_STRATEGY = "AppendClassNamePrefix";

    @Override
    public String generate(String originKey, Class targetClass) {
        return targetClass.getSimpleName() + "." + originKey;
    }

    @Override
    public String strategy() {
        return KEY_GENERATOR_STRATEGY;
    }
}
