package org.wei.design.bridgemode;

public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机~");
    }

    @Override
    public void call() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机~");
    }
}
