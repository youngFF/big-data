package com.hyena.big.data.generator;

/**
 * 生成big-data项目所需要的数据
 *
 */
public interface Generator{

    /**
     * generate test-data for specific hadoop project
     */
    void generatorData();
}