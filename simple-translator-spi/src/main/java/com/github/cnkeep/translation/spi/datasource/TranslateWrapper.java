
package com.github.cnkeep.translation.spi.datasource;

import com.github.cnkeep.translation.spi.core.lang.Language;
import java.util.List;
import java.util.Objects;

/**
 * TranslateEntity
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/30
 */
public class TranslateWrapper {
    private final String dataSourceType;
    private final List<String> keys;
    private final Language language;

    public TranslateWrapper(String dataSourceType, List<String> keys, Language language) {
        if (Objects.isNull(dataSourceType)) {
            throw new IllegalArgumentException("dataSourceType can't no null");
        }

        if (Objects.isNull(language)) {
            throw new IllegalArgumentException("language can't no null");
        }

        this.dataSourceType = dataSourceType;
        this.keys = keys;
        this.language = language;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public List<String> getKeys() {
        return keys;
    }

    public Language getLanguage() {
        return language;
    }
}
