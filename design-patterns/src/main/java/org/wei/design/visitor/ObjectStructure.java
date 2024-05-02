package org.wei.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private final List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }
    public void detach(Element element) {
        elements.remove(element);
    }
    public void display(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
