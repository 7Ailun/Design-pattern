package org.wei.design.memento;

import lombok.Data;

@Data
public class Memento {

    // 保存状态
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
