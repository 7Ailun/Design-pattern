package org.wei.design.builder;

/**
 * 普通零件构建类
 */
public class CommonBuilder implements Builder{
    private final Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("普通零件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("普通零件B");
    }

    @Override
    public void buildPartC() {
        product.addPart("普通零件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
