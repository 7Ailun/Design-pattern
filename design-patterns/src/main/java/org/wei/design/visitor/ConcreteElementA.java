package org.wei.design.visitor;

public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
