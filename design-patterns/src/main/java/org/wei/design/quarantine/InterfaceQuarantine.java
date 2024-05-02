package org.wei.design.quarantine;

/**
 * 接口隔离原则
 */
public class InterfaceQuarantine {
    public static void main(String[] args) {
        A a = new A();
        a.operation1(new B());
        a.operation2(new B());
        a.operation3(new B());
        C c = new C();
        c.operation1(new D());
        c.operation4(new D());
        c.operation5(new D());
    }
}
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
class A {
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }
    public void operation2(Interface1 interface1) {
        interface1.operation2();
    }
    public void operation3(Interface1 interface1) {
        interface1.operation3();
    }
}

class C {
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }
    public void operation4(Interface1 interface1) {
        interface1.operation4();
    }
    public void operation5(Interface1 interface1) {
        interface1.operation5();
    }
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("A 调用了方法1");
    }

    @Override
    public void operation2() {
        System.out.println("A 调用了方法2");
    }

    @Override
    public void operation3() {
        System.out.println("A 调用了方法3");
    }

    @Override
    public void operation4() {
        System.out.println("A 调用了方法4");
    }

    @Override
    public void operation5() {
        System.out.println("A 调用了方法5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("C 调用了方法1");
    }

    @Override
    public void operation2() {
        System.out.println("C 调用了方法2");
    }

    @Override
    public void operation3() {
        System.out.println("C 调用了方法3");
    }

    @Override
    public void operation4() {
        System.out.println("C 调用了方法4");
    }

    @Override
    public void operation5() {
        System.out.println("C 调用了方法5");
    }
}
