package org.wei.design.factory.abstractfactory.phone;

import org.wei.design.factory.abstractfactory.Phone;

/**
 * 华为手机
 */
public class HuaWeiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("使用华为手机打电话");
    }
}
