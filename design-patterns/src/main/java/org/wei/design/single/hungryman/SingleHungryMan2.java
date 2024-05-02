package org.wei.design.single.hungryman;

/**
 * 饿汉单例（静态代码块）
 */
public class SingleHungryMan2 {
    private static SingleHungryMan2 singleHungryMan2;

    static {
        singleHungryMan2 = new SingleHungryMan2();
    }
    private SingleHungryMan2() {

    }

    public static SingleHungryMan2 getInstance() {
        return singleHungryMan2;
    }
}
