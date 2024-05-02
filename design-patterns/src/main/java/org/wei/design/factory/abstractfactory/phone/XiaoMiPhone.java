package org.wei.design.factory.abstractfactory.phone;

import org.wei.design.factory.abstractfactory.Phone;

/**
 * 小米手机
 */
public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("使用小米手机打电话");
    }
}
