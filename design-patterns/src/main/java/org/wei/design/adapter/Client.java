package org.wei.design.adapter;

import org.wei.design.adapter.objectadapter.Phone;
import org.wei.design.adapter.objectadapter.Voltage220V;
import org.wei.design.adapter.objectadapter.VoltageAdapter;

public class Client {
    public static void main(String[] args) {
        // 类适配器
//        Phone phone = new Phone();
//        phone.charging(new VoltageAdapter());
        // 对象适配器
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
