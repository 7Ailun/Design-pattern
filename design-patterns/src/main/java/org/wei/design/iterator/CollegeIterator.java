package org.wei.design.iterator;

/**
 * 迭代器接口
 */
public interface CollegeIterator {
    boolean hasNext();

    Object next();

    void remove();// 删除当前迭代器所指向的元素
}
