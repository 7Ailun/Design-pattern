package org.wei.design.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDao();
        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        ITeachDao proxyInstance = (ITeachDao)proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
