package org.wei.design.factory.abstractfactory.factory;

import org.wei.design.factory.abstractfactory.AbstractFactory;
import org.wei.design.factory.abstractfactory.Pad;
import org.wei.design.factory.abstractfactory.Phone;
import org.wei.design.factory.abstractfactory.pad.HuaWeiPad;
import org.wei.design.factory.abstractfactory.phone.HuaWeiPhone;

/**
 * 华为工厂
 */
public class HuaWeiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Pad createPad() {
        return new HuaWeiPad();
    }
}
