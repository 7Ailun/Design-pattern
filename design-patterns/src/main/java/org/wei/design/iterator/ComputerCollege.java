package org.wei.design.iterator;

public class ComputerCollege implements College{
    private final Department[] departments;
    private int position = 0;

    // 构造器
    public ComputerCollege() {
        departments = new Department[5];
        departments[position++] = new Department("Java开发","Java开发");
        departments[position++] = new Department("前端开发","前端开发");
        departments[position++] = new Department("大数据开发","大数据开发");
    }


    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[position++] = department;
    }
    @Override
    public ComputerCollegeCollegeIterator getCollegeIterator() {
        return new ComputerCollegeCollegeIterator(departments);
    }
}
