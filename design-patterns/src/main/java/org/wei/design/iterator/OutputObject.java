package org.wei.design.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputObject {
    private final List<College> collegeList;
    public OutputObject(List<College> collegeList){
        this.collegeList = collegeList;
    }

    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("------" + college.getName() + "------");
            CollegeIterator collegeIterator = college.getCollegeIterator();
            printDepartment(collegeIterator);
        }
    }

    /**
     * 打印专业
     * @param collegeIterator
     */
    public void printDepartment(CollegeIterator collegeIterator) {
        while (collegeIterator.hasNext()) {
            Department department = (Department) collegeIterator.next();
            System.out.println("Department Name: " + department.getName());
        }
    }
}
