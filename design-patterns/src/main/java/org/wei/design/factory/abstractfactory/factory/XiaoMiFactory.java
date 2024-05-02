package org.wei.design.factory.abstractfactory.factory;

import org.wei.design.factory.abstractfactory.AbstractFactory;
import org.wei.design.factory.abstractfactory.Pad;
import org.wei.design.factory.abstractfactory.Phone;
import org.wei.design.factory.abstractfactory.pad.XiaoMiPad;
import org.wei.design.factory.abstractfactory.phone.XiaoMiPhone;

/**
 * 小米工厂
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Pad createPad() {
        return new XiaoMiPad();
    }
}
