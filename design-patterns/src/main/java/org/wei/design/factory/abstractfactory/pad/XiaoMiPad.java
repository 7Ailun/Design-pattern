package org.wei.design.factory.abstractfactory.pad;

import org.wei.design.factory.abstractfactory.Pad;

/**
 * 小米平板
 */
public class XiaoMiPad implements Pad {
    @Override
    public void play() {
        System.out.println("使用小米平板打游戏");
    }
}
