package org.wei.design.factory.simple;

/**
 * 手机工厂（客户端）
 */
public class PhoneFactory {
    public Phone createPhone(String type) {
        if ("华为".equals(type)) {
            return new HuaWeiPhone();
        } else if ("小米".equals(type)) {
            return new XiaoMiPhone();
        } else {
            return null;
        }
    }
}
