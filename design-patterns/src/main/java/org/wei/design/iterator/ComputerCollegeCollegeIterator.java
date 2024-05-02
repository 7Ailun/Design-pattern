package org.wei.design.iterator;


/**
 * 计算机学院迭代器
 */
public class ComputerCollegeCollegeIterator implements CollegeIterator {
    private final Department[] departments;
    private int index = 0;

    public ComputerCollegeCollegeIterator(Department[] department) {
        this.departments = department;
    }

    @Override
    public boolean hasNext() {
        if (index + 1 > departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }

    @Override
    public void remove() {
        departments[index] = null;
    }
}
