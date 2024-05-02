package org.wei.design.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method1();

        facade.methods();
    }
}
