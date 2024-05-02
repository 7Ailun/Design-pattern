package org.wei.design.flyweight;

/**
 * 不共享的网站
 */
public class UnSharedConcreteFlyweight extends WebSite {

    @Override
    public void use(User user) {
        System.out.println("不共享的网站，使用者：" + user.getName());
    }
}
