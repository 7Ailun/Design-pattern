package org.wei.design.dependencyinversion.improve;

/**
 * 依赖倒置
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WChat());
    }
}

interface Receiver {
    public String getInfo();
}
class Email implements Receiver{
    public String getInfo() {
        return "电子邮箱消息：Hello Email";
    }
}

class WChat implements Receiver{
    public String getInfo() {
        return "微信消息：Hello WChat";
    }
}

class Person {
    public void receive(Receiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
