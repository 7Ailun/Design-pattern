package org.wei.design.bridgemode;


/**
 * 智能机
 */
public class SmartPhone extends AbstractBridge{
    public SmartPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open() {
        super.open();
        System.out.println("智能机");
    }
    @Override
    public void call() {
        super.close();
        System.out.println("智能机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("智能机");
    }
}
