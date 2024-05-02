package org.wei.design.richtersubstitution;

/**
 * 问题案例
 */
public class RichterSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("1 - 3 = " + a.func1(1, 3));
        System.out.println("6 - 2 = " + a.func1(6, 2));
        System.out.println("7 - 1 = " + a.func1(7, 1));
        System.out.println("13 - 7 = " + a.func1(13, 7));
        System.out.println("-------------------------------------------");
        B b = new B();
        System.out.println("1 - 3 = " + b.func1(1, 3));
        System.out.println("6 - 2 = " + b.func1(6, 2));
        System.out.println("7 - 1 = " + b.func1(7, 1));
        System.out.println("13 - 7 = " + b.func1(13, 7));
    }
}

class A {
    public int func1(int a, int b) {
        return a - b;
    }
}

/**
 * 我们知道B类继承了A类，我们调用 func1 的时候以为着B类继承了A类，所以应该返回的是 a - b，但是实际返回的是 a + b，所以出现了问题
 */
class B extends A {
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return a * b;
    }
}
