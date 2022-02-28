/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.appliation.key;

import com.github.cnkeep.translation.spi.application.annotation.TranslateKey;
import com.github.cnkeep.translation.spi.application.KeyGenerator;

/**
 * AppendPrefixKeyGenerator
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/2/14
 */
public class AppendPrefixKeyGenerator implements KeyGenerator {
    @Override
    public String generate(String originKey, Class targetClass) {
        return targetClass.getSimpleName() + "." + originKey;
    }

    @Override
    public TranslateKey.TranslateKeyStrategy strategy() {
        return TranslateKey.TranslateKeyStrategy.APPEND_PREFIX;
    }
}
