package org.wei.design.builder;


public interface Builder {
    /**
     * 构建零件 A
     */
    void buildPartA();
    /**
     * 构建零件 B
     */
    void buildPartB();
    /**
     * 构建零件 C
     */
    void buildPartC();

    /**
     * 获取构建后的产品
     * @return 产品
     */
    Product getResult();
}
