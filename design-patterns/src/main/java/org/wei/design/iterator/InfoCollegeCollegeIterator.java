package org.wei.design.iterator;


import java.util.List;

/**
 * 信息安全学院迭代器
 */
public class InfoCollegeCollegeIterator implements CollegeIterator {
    private final List<Department> departmentList;
    private int index = 0;

    public InfoCollegeCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index + 1 > departmentList.size() || departmentList.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index++);
    }

    @Override
    public void remove() {

        departmentList.remove(index);
    }
}
