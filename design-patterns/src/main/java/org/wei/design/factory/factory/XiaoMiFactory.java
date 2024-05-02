package org.wei.design.factory.factory;

/**
 * 小米手机工厂
 */
public class XiaoMiFactory implements Factory{
    @Override
    public Phone create() {
        return new XiaoMiPhone();
    }
}
