package org.wei.design.tertiumquid;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
    private String sex;
    private int requestAge;
    private MarriageAgency marriageAgency;

    public Person(String name, int age, String sex, int requestAge,MarriageAgency marriageAgency) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        marriageAgency.register(this); // 注册会员
    }
    // 寻找对象
    public void findPartner() {
        marriageAgency.pair(this);
    }
}
