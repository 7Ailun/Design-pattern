package org.wei.design.compositepattern;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大学");
        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("生命学院", "生命学院");
        OrganizationComponent department1 = new Department("软件工程", "软件工程");
        OrganizationComponent department2 = new Department("大数据", "大数据");
        OrganizationComponent department3 = new Department("生物工程", "生物工程");
        OrganizationComponent department4 = new Department("细胞生物学", "细胞生物学");
        college1.add(department1);
        college1.add(department2);
        college2.add(department3);
        college2.add(department4);
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
