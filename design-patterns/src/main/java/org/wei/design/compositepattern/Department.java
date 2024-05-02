package org.wei.design.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 专业
 */
public class Department extends OrganizationComponent{
List<OrganizationComponent> organizationComponents = new ArrayList<>();
    public Department(String name, String des) {
        super(name, des);
    }



    @Override
    protected void print() {
        System.out.println("专业：" + getName());
    }
}
