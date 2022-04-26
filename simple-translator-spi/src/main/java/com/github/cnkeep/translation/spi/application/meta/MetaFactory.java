/**
 * ***************************************************** Copyright (C) 2019 bytedance.com. All
 * Rights Reserved This file is part of bytedance EA project. Unauthorized copy of this file, via
 * any medium is strictly prohibited. Proprietary and Confidential. ****************************************************
 **/

package com.github.cnkeep.translation.spi.application.meta;

import com.github.cnkeep.translation.spi.LangEnum;
import com.github.cnkeep.translation.spi.application.annotation.TranslateType;
import java.util.List;

/**
 * 数据元工厂类
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/11/22
 **/
public interface MetaFactory {
    /**
     * 获取翻译后的数据元
     *
     * @param ids
     * @param lang
     * @return
     */
    List<Meta> getTranslatedMeta(List<String> ids, LangEnum lang);

    /**
     * 支持的翻译类型
     *
     * @return
     */
    List<Class<TranslateType>> supportTypes();
}
