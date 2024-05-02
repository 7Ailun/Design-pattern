package org.wei.design.single.lazyman;

/**
 * 使用 synchronized 实现懒汉式单例
 */
public class SingleLazyMan2 {
    private static SingleLazyMan2 singleLazyMan2;

    private SingleLazyMan2() {

    }

    public synchronized static SingleLazyMan2 getInstance() {
        // 使用 synchronized 关键字，但是锁的粒度大了，性能会降低
        if (singleLazyMan2 == null) {
            singleLazyMan2 = new SingleLazyMan2();
        }
        return singleLazyMan2;
    }
}
