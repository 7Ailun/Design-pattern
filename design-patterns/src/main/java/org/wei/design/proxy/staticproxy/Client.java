package org.wei.design.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDao();
        ITeachDao proxy = new TeachProxy(teachDao);
        proxy.teach();
    }
}
