package org.wei.design.factory.abstractfactory;

import org.wei.design.factory.abstractfactory.factory.HuaWeiFactory;
import org.wei.design.factory.abstractfactory.factory.XiaoMiFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 华为系列
        AbstractFactory huaweiFactory = new HuaWeiFactory();
        huaweiFactory.createPhone().call();
        huaweiFactory.createPad().play();

        // 小米系列
        AbstractFactory xiaomiFactory = new XiaoMiFactory();
        xiaomiFactory.createPhone().call();
        xiaomiFactory.createPad().play();

    }
}
