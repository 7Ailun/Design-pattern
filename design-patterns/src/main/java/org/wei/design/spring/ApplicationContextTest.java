package org.wei.design.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContext.xml");

       // 获取bean
        Calc calc = (Calc)applicationContext.getBean(Calc.class);
        System.out.println("calc = " + calc);
        System.out.println(calc.add(1, 2));
        System.out.println(calc.sub(10, 2));
        System.out.println(calc.mul(2, 2));
        System.out.println(calc.div(18, 2));
    }
}
