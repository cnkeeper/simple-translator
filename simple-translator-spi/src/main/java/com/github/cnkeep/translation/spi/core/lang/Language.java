/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.spi.core.lang;

import java.util.Objects;

/**
 * Language
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/10/11
 */
public class Language {
    private final String code;

    public Language(String code) {
        if (Objects.isNull(code)) {
            throw new IllegalArgumentException("code not be null");
        }
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
