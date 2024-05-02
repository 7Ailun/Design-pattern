package org.wei.design.single.hungryman;

/**
 * 饿汉单例（静态成员变量）
 */
public class SingleHungryMan {
    private static final SingleHungryMan singleHungryMan = new SingleHungryMan();

    private SingleHungryMan() {
    }

    public static SingleHungryMan getInstance() {
        return singleHungryMan;
    }
}
