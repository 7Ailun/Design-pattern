package org.wei.design.single.lazyman;

/**
 * 枚举单例，线程安全 并且不会被反射破坏！
 */
public enum SingleLazyManEnum {
    INSTANCE;

    private SingleLazyManEnum()
    {
        System.out.println("SingleLazyManEnum 初始化~");
    }

    public static SingleLazyManEnum getInstance()
    {
        return INSTANCE;
    }
}
