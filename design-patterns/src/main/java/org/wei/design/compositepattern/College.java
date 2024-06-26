package org.wei.design.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends OrganizationComponent{
    private final List<OrganizationComponent> organizationComponents = new ArrayList<>();
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
