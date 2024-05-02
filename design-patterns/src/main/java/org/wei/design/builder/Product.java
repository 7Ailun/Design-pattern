package org.wei.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类
 */
public class Product {
    private final List<Object> parts = new ArrayList<>();

    public void addPart(Object part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("----产品创建成功----");
        for (Object part : parts) {
            System.out.println(part);
        }
    }
}

