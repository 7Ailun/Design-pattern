package org.wei.design.bridgemode;

public class Test {
    public static void main(String[] args) {
        Brand brand = new Vivo();
        AbstractBridge phone1 = new FolderPhone(brand);
        phone1.open();
        phone1.call();
        phone1.close();

        Brand xiaomi = new Xiaomi();
        AbstractBridge phone2 = new SmartPhone(xiaomi);
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
