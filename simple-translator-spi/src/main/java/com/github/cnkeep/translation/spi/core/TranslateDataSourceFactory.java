
package com.github.cnkeep.translation.spi.core;


/**
 * TranslateDataSourceFactory
 *
 * @author LeiLi.Zhang <mailto:zhangleili@bytedance.com>
 * @date 2021/12/30
 */
public interface TranslateDataSourceFactory {
    /**
     * 注册翻译数据源
     * @param dataSource
     */
    void register(TranslateDataSource dataSource);

    /**
     * 移除翻译数据源
     * @param dataSource
     */
    void unRegister(TranslateDataSource dataSource);

    /**
     * 查询数据源
     * @param dataSourceType
     * @return
     */
    TranslateDataSource lookup(DataSourceType dataSourceType);
}
