package org.wei.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 保存历史状态
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    /**
     * 添加状态
     * @param memento
     */
    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    /**
     * 获取状态
     * @param index
     * @return
     */
    public String getMemento(int index) {
        return mementos.get(index).getState();
    }
}
