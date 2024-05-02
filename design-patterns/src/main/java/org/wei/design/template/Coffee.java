package org.wei.design.template;

public class Coffee extends Beverage{
    @Override
    public void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
