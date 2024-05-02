package org.wei.design.factory.simple;

/**
 * 华为手机
 */
public class HuaWeiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("使用华为手机打电话");
    }
}
