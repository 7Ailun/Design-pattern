package org.wei.design.bridgemode;


public class AbstractBridge {

    private final Brand brand;

    public AbstractBridge(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }
    public void call() {
        brand.call();
    }
    public void close() {
        brand.close();
    }

}
