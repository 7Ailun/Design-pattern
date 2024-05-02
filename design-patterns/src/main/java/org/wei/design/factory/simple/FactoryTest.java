package org.wei.design.factory.simple;

public class FactoryTest {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone huawei = phoneFactory.createPhone("华为");
        Phone xiaomi = phoneFactory.createPhone("小米");
        huawei.call();
        xiaomi.call();
    }
}
