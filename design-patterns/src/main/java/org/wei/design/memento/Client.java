package org.wei.design.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("状态#活力四射");
        System.out.println("开始之前的状态：" + originator.getStatus());
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.createMemento());
        originator.setStatus("状态#累成狗");
        System.out.println("打怪打怪~~ 当前状态：" + originator.getStatus());
        caretaker.addMemento(originator.createMemento());
        originator.setStatus(caretaker.getMemento(0));
        System.out.println("终于打完了，恢复~~~ 当前状态：" + originator.getStatus());
    }
}
