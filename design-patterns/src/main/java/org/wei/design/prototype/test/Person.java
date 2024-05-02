package org.wei.design.prototype.test;

import lombok.Data;

@Data
public class Person implements Cloneable {
    private Address address;
    // 省略构造函数、Getter&Setter方法
    public Person(Address address) {
        this.address = address;
    }
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}