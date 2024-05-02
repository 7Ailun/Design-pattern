package org.wei.design.adapter.objectadapter;

/**
 * 适配器
 */
public class VoltageAdapter implements Voltage5V {
    private final Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int voltage220v = voltage220V.output220V();
        return voltage220v / 44;
    }
}
