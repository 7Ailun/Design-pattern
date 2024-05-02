package org.wei.design.factory.simple;

/**
 * 小米手机
 */
public class XiaoMiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("使用小米手机打电话");
    }
}
