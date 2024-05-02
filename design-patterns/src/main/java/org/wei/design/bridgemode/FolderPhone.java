package org.wei.design.bridgemode;

/**
 * 折叠机
 */
public class FolderPhone extends AbstractBridge{
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠机");
    }
}
