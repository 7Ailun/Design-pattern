package org.wei.design.strategy;

public class WildDuck extends Duck{

    public WildDuck() {
        super.flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("我是野鸭子嘻嘻");
    }

}
