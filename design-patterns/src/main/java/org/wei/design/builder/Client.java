package org.wei.design.builder;

public class Client {
    public static void main(String[] args) {
        CommonBuilder commonBuilder = new CommonBuilder();
        Director director = new Director(commonBuilder);
        Product product = director.construct();
        product.show();
        System.out.println("----------------------------");
        SeniorBuilder seniorBuilder = new SeniorBuilder();
        director.setBuilder(seniorBuilder);
        Product product1 = director.construct();
        product1.show();
        StringBuilder stringBuilder = new StringBuilder("aaaaa");
    }
}
