package org.wei.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class InfoCollege implements College{
    private final List<Department> departmentList;

    // 构造器
    public InfoCollege() {
        departmentList = new ArrayList<>();
        departmentList.add(new Department("信息安全01", "信息安全01"));
        departmentList.add(new Department("信息安全02", "信息安全02"));
        departmentList.add(new Department("信息安全03", "信息安全03"));
    }

    @Override
    public String getName() {
        return "信息安全学院";
    }

    @Override
    public void addDepartment(Department department) {
        departmentList.add(department);
    }
    @Override
    public InfoCollegeCollegeIterator getCollegeIterator() {
        return new InfoCollegeCollegeIterator(departmentList);
    }
}
