package org.wei.design.facade;

public class Facade {
    private Class1 class1 = new Class1();
    private Class2 class2 = new Class2();
    private Class3 class3 = new Class3();

    public void method1() {
        class1.method1();
    }
    public void method2() {
        class2.method2();
    }
    public void method3() {
        class3.method3();
    }
    public void methods() {
        class1.method1();
        class2.method2();
        class3.method3();
    }
}
