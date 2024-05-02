package org.wei.design.single.lazyman;

/**
 * 懒汉式单例模式
 */
public class SingleLazyMan {
    private static SingleLazyMan singleLazyMan;

    private SingleLazyMan() {

    }

    public static SingleLazyMan getInstance() {
        // 存在线程安全问题
        if (singleLazyMan == null) {
            singleLazyMan = new SingleLazyMan();
        }
        return singleLazyMan;
    }
}
