package org.wei.design.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TeachDao teachDao = (TeachDao) proxyFactory.getInstance(new TeachDao());
        teachDao.teach();
    }
}
