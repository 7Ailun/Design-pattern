package org.wei.design.strategy;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        Byte a = 127;
        Byte b = 2;
        System.out.println((a * b));
    }
}
