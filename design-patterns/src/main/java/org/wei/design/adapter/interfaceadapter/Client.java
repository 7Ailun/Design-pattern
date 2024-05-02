package org.wei.design.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        MethodAdapter methodAdapter = new MethodAdapter() {
            @Override
            public void method1() {
                System.out.println("我只实现了 method1");
            }
        };
        methodAdapter.method1(); // 结果：我只实现了 method1
    }
}
