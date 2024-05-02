package org.wei.design.compositepattern;

import lombok.Data;

/**
 * 定义组合模式中的方法
 */
@Data
public abstract class OrganizationComponent {
    private String name;
    private String des;
    public OrganizationComponent(String name, String des)
    {
        this.name = name;
        this.des = des;
    }

    /**
     * 空方法，防止叶子节点来调用
     * @param organizationComponent
     */
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 空方法，防止叶子节点来调用
     * @param organizationComponent
     */
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印输出
     */
    protected abstract void print();
}
