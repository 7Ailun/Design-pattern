package org.wei.design.factory.factory;

import java.util.Calendar;

public class FactoryTest {
    public static void main(String[] args) {
        // 这样还是存在问题，随着手机的种类发展，需要接入的类型越来越多
        Factory huaWeiFactory = new HuaWeiFactory();
        Factory xiaoMiFactory = new XiaoMiFactory();
        Phone huawei = huaWeiFactory.create();
        Phone xiaomi = xiaoMiFactory.create();
        huawei.call();
        xiaomi.call();
    }

}
