package org.wei.design.strategy;

public abstract class Duck {

    // 飞行策略
    FlyBehavior flyBehavior;

    public void bark() {
        System.out.println("嘎嘎嘎，我是大鸭子");
    }
    public abstract void display();
    public void fly() {
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

}
