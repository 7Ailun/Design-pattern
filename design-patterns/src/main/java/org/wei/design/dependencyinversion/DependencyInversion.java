package org.wei.design.dependencyinversion;

/**
 * 问题示例
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮箱消息：Hello Email";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
