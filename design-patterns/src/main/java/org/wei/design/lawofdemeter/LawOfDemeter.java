package org.wei.design.lawofdemeter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 违反迪米特法则案例
 */
public class LawOfDemeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManger());
    }
}

@Data
class Employee {
    private long id;
}

@Data
class CollegeEmployee {
    private long id;
}

class CollegeManger {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId(i);
            list.add(emp);
        }
        return list;
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId(i);
            list.add(emp);
        }
        return list;
    }

    public void printAllEmployee(CollegeManger sub) {
        System.out.println("------------学校员工---------------");
        List<Employee> list = this.getAllEmployee();
        for (Employee employee : list) {
            System.out.println("employee = " + employee);
        }
        System.out.println("------------学院员工---------------");
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println("collegeEmployee = " + collegeEmployee);
        }

    }
}
