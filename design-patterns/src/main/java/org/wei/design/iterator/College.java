package org.wei.design.iterator;

public interface College {
    String getName();
    void addDepartment(Department department);
    CollegeIterator getCollegeIterator();
}
