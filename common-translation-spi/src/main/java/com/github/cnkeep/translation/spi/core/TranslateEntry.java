
package com.github.cnkeep.translation.spi.core;

import com.github.cnkeep.translation.spi.LangEnum;
import com.github.cnkeep.translation.spi.core.DataSourceType;
import java.util.List;
import lombok.Getter;

/**
 * TranslateEntry
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/30
 */
@Getter
public class TranslateEntry {
    private final DataSourceType dataSourceType;
    private final List<String> keys;
    private final LangEnum lang;

    public TranslateEntry(DataSourceType dataSourceType, List<String> keys, LangEnum lang) {
        this.dataSourceType = dataSourceType;
        this.keys = keys;
        this.lang = lang;
    }
}
