package org.wei.design.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        objectStructure.display(new ConcreteVisitor1());
        objectStructure.display(new ConcreteVisitor2());
    }
}
