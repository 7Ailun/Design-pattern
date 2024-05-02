package org.wei.design.template;

public abstract class Beverage {
    // 模板方法，决定了算法骨架。相当于TemplateMethod()方法
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customWantsCondiments())
        {
            addCondiments();
        }
    }

    // 共性操作，直接在抽象类中定义
    protected void boilWater() {
        System.out.println("烧开水");
    }

    // 共性操作，直接在抽象类中定义
    protected void pourInCup() {
        System.out.println("倒入杯中");
    }

    // 钩子方法，决定某些算法步骤是否挂钩在算法中
    protected boolean customWantsCondiments() {
        return true;
    }

    // 特殊操作，在子类中具体实现
    protected abstract void brew();

    // 特殊操作，在子类中具体实现
    protected abstract void addCondiments();
}
