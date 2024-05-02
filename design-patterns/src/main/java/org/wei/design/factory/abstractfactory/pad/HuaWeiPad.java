package org.wei.design.factory.abstractfactory.pad;

import org.wei.design.factory.abstractfactory.Pad;

/**
 * 华为平板
 */
public class HuaWeiPad implements Pad {
    @Override
    public void play() {
        System.out.println("使用华为平板打游戏");
    }
}
