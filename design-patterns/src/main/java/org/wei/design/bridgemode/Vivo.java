package org.wei.design.bridgemode;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机~");
    }

    @Override
    public void call() {
        System.out.println("用Vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机~");
    }
}
