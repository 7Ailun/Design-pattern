package org.wei.design.factory.factory;

/**
 * 华为手机工厂
 */
public class HuaWeiFactory implements Factory{
    @Override
    public Phone create() {
        return new HuaWeiPhone();
    }
}
