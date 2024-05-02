package org.wei.design.template;

import org.springframework.context.ConfigurableApplicationContext;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println("--------------------");
        Beverage tea = new Tea();
        tea.prepareBeverage();
        System.out.println("--------------------");
        Beverage water = new Water();
        water.prepareBeverage();
//        ConfigurableApplicationContext
    }
}
