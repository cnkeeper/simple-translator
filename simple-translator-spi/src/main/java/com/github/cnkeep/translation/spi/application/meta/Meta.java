/**
 * ***************************************************** Copyright (C) 2019 bytedance.com. All
 * Rights Reserved This file is part of bytedance EA project. Unauthorized copy of this file, via
 * any medium is strictly prohibited. Proprietary and Confidential. ****************************************************
 **/
package com.github.cnkeep.translation.spi.application.meta;

/**
 * 翻译数据元
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/11/22
 **/
public interface Meta {

    /**
     * 获取翻译数据属性
     *
     * @param field
     * @return
     */
    String getProperty(String field);

    /**
     * 获取翻译数据元主键
     *
     * @return
     */
    String getPrimaryKey();
}
