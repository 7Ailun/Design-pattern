package org.wei.design.single;

import org.wei.design.single.hungryman.SingleHungryMan;
import org.wei.design.single.lazyman.*;

public class SingleTest {
    public static void main(String[] args) {
//        SingleHungryMan singleHungryMan1 = SingleHungryMan.getInstance();
//        SingleHungryMan singleHungryMan2 = SingleHungryMan.getInstance();
//        System.out.println(singleHungryMan1 == singleHungryMan2);
        // 测试普通的懒汉模式
//        test1();
        // 测试 synchronized
//        test2();
        // 测试双层判断
//        test3();
        // 静态内部类
//        test4();
        // 枚举单例
        test5();
    }


    static void  test1() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleLazyMan instance = SingleLazyMan.getInstance();
                System.out.println("instance = " + instance);
            }).start();
        }
    }

    static void  test2() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleLazyMan2 instance = SingleLazyMan2.getInstance();
                System.out.println("instance = " + instance);
            }).start();
        }
    }

    static void  test3() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleLazyMan3 instance = SingleLazyMan3.getInstance();
                System.out.println("instance = " + instance);
            }).start();
        }
    }
    static void  test4() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleLazyMan4 instance = SingleLazyMan4.getInstance();
                System.out.println("instance = " + instance);
            }).start();
        }
    }
    static void  test5() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingleLazyManEnum instance = SingleLazyManEnum.getInstance();
                System.out.println("instance = " + instance.hashCode());
            }).start();
        }
    }
}
