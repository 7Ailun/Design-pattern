package org.wei.design.visitor;

public abstract class Element {
    public abstract void accept(Visitor visitor);
}
