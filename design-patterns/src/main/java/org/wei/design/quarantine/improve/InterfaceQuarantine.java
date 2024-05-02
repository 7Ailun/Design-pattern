package org.wei.design.quarantine.improve;

/**
 * 接口隔离原则
 */
public class InterfaceQuarantine {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); // A 通过接口 依赖 B 调用方法
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());  // C 通过接口 依赖 D调用方法
        c.depend4(new D());
        c.depend5(new D());
    }
}
interface Interface1 {
    void operation1();
}
interface Interface2 {
    void operation2();
    void operation3();
}
interface Interface3 {
    void operation4();
    void operation5();
}
class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }
    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}

class C {
    public void depend1(Interface1 interface1) {
        interface1.operation1();

    }
    public void depend4(Interface3 interface3) {
        interface3.operation4();

    }
    public void depend5(Interface3 interface3) {
        interface3.operation5();
    }

}

class B implements Interface1, Interface2{

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

}

class D implements Interface1,Interface3 {
    @Override
    public void operation1() {
        System.out.println("C 调用了方法1");
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
