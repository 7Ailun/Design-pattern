package org.wei.design.memento;

import lombok.Data;


public class Originator {
    private String status;
    public Originator(String status) {
        this.status = status;
    }

    public Memento createMemento() {
        return new Memento(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
