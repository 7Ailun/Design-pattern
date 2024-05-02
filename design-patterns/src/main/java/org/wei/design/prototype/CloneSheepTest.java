package org.wei.design.prototype;

public class CloneSheepTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("小黑子", 2.5);
        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();
        Sheep clone3 = sheep.clone();
        Sheep clone4 = sheep.clone();
        Sheep clone5 = sheep.clone();
        System.out.println("clone1 = " + clone1.hashCode());
        System.out.println("clone2 = " + clone2.hashCode());
        System.out.println("clone3 = " + clone3);
        System.out.println("clone4 = " + clone4);
        System.out.println("clone5 = " + clone5);
    }
}
