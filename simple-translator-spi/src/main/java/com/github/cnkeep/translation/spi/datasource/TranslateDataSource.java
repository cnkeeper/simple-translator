
package com.github.cnkeep.translation.spi.datasource;

import com.github.cnkeep.translation.spi.core.lang.Language;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * TranslateDataSource
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/30
 */
public interface TranslateDataSource {
    /**
     * 获取单个翻译文案
     *
     * @param key
     * @param language
     * @return
     */
    Optional<String> getText(String key, Language language);

    /**
     * 批量获取翻译文案
     *
     * @param keyList
     * @param language
     * @return
     */
    Map<String, String> getTexts(List<String> keyList, Language language);

    /**
     * 数据源类型
     *
     * @return
     */
    String type();

    /**
     * 优先级，数值越小优先级越高，高优先级会覆盖低优先级
     *
     * @return
     */
    default int order() {
        return Integer.MAX_VALUE;
    }

}
