package org.wei.design.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSite webSite1 = FlyweightFactory.getWebSiteCategory("新闻");
        WebSite webSite2 = FlyweightFactory.getWebSiteCategory("微信公众号");
        WebSite webSite3 = FlyweightFactory.getWebSiteCategory("博客");
        webSite1.use(new User("张三"));
        webSite2.use(new User("李四"));
        webSite3.use(new User("王五"));

    }
}
