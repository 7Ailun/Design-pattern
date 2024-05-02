package org.wei.design.builder;

/**
 * 高级零件构建类
 */
public class SeniorBuilder implements Builder{
    private final Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("高级零件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("高级零件B");
    }

    @Override
    public void buildPartC() {
        product.addPart("高级零件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
