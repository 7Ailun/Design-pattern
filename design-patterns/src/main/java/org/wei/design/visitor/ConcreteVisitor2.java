package org.wei.design.visitor;

public class ConcreteVisitor2 extends Visitor{

    @Override
    public void visitConcreteElementA(Element element) {
        System.out.println(this.getClass().getName() + "访问：" + element.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(Element element) {
        System.out.println(this.getClass().getName() + "访问：" + element.getClass().getName());
    }
}
