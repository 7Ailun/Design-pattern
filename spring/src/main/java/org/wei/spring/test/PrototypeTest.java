package org.wei.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wei.spring.Monster;

public class PrototypeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
        Monster id01 = (Monster)applicationContext.getBean("id01");
        Monster id02 = (Monster)applicationContext.getBean("id01");
        System.out.println("id01 = " + id01.hashCode() + " " + id01);
        System.out.println("id02 = " +  id02.hashCode() + " " + id02);
    }
}