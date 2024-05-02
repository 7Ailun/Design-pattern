package org.wei.design.prototype.test;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
// true
        System.out.println(person1.getAddress() == person1Copy.getAddress());
        System.out.println(person1 == person1Copy);
        System.out.println("person1.hashCode()" + person1.hashCode());
        System.out.println("person1Copy.hashCode()" + person1Copy.hashCode());

        System.out.println("hashCode()" + person1.getAddress().hashCode());
        System.out.println("hashCode()" + person1Copy.getAddress().hashCode());

    }
}
