package org.wei.design.strategy;

public class ToyDuck extends Duck{
    public ToyDuck() {
        super.flyBehavior = new NoFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("我是玩具鸭子哈哈");
    }

}
