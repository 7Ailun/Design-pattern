package org.wei.design.single.lazyman;

/**
 * 使用 双重检测锁 + volatile
 */
public class SingleLazyMan3 {
    private static volatile SingleLazyMan3 singleLazyMan3;

    private SingleLazyMan3() {

    }

    public static SingleLazyMan3 getInstance() {
        // 使用 synchronized 关键字，但是锁的粒度大了，性能会降低
        if (singleLazyMan3 == null) {
            // 注意这里，如果只是单层判断的话，还是存在并发问题
            synchronized ((SingleLazyMan3.class)) {
                if (singleLazyMan3 == null) {
                    singleLazyMan3 = new SingleLazyMan3();
                }
            }
        }
        return singleLazyMan3;
    }
}
