package org.wei.design.tertiumquid;


/**
 * 中介者类
 * -- 婚姻中介所
 */
public interface MarriageAgency {
    void register(Person person); // 注册会员
    void pair(Person person); // 为 person 配对
}
