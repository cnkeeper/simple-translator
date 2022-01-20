
package com.github.cnkeep.translation.spi.core;

import com.github.cnkeep.translation.spi.LangEnum;
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
     * @param lang
     * @return
     */
    Optional<String> getText(String key, LangEnum lang);

    /**
     * 批量获取翻译文案
     *
     * @param keyList
     * @param lang
     * @return
     */
    Map<String, String> getTexts(List<String> keyList, LangEnum lang);

    /**
     * 数据源类型
     *
     * @return
     */
    DataSourceType type();

    /**
     * 优先级，数值越小优先级越高，高优先级会覆盖低优先级
     * @return
     */
    default int order(){
        return Integer.MAX_VALUE;
    }

}
