package org.wei.design.flyweight;



public class ConcreteWebSite extends WebSite{
    private final String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }
    @Override
    public void use(User user) {
        System.out.println("网站类型：" + type + " 用户：" + user.getName());
    }
}
