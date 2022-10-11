/*
 * *****************************************************
 * Copyright (C) 2022 bytedance.com. All Rights Reserved
 * This file is part of bytedance EA project.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 * ****************************************************
 */

package com.github.cnkeep.translation.spi.core.lang;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DefaultLanguageFactory
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2022/10/11
 */
public class DefaultLanguageFactory implements LanguageFactory {
    private static final Map<String, Language> BEAN_MAP = new ConcurrentHashMap<>();

    static {
        BEAN_MAP.put("ZH", new Language("ZH"));
        BEAN_MAP.put("EN", new Language("EN"));
    }

    @Override
    public void register(String key, Language bean) {
        BEAN_MAP.put(key, bean);
    }

    @Override
    public void deregister(String key) {
        BEAN_MAP.remove(key);
    }

    @Override
    public Map<String, Language> listAll() {
        return new HashMap<>(BEAN_MAP);
    }
}
