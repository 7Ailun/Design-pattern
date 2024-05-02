package org.wei.design.template;

public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加入柠檬");
    }
}
