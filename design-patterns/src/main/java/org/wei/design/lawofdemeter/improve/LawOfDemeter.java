package org.wei.design.lawofdemeter.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
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

    public void printAllEmployee() {
        System.out.println("------------学院员工---------------");
        List<CollegeEmployee> list1 = this.getAllEmployee();
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println("collegeEmployee = " + collegeEmployee);
        }
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
        sub.printAllEmployee();
    }
}
