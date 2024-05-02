package org.wei.design.adapter.classadapter;

/**
 * 适配器
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        int voltage220v = output220V();
        return voltage220v / 44;
    }
}
