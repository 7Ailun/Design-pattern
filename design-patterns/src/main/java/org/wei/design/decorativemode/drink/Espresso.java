package org.wei.design.decorativemode.drink;

import org.wei.design.decorativemode.drink.Coffee;

/**
 * 意大利浓咖啡
 */
public class Espresso extends Coffee {
    public Espresso() {
        setDescription("意大利浓咖啡");
        setPrice(3.0);
    }
    @Override
    public double cost() {
        System.out.println("意大利浓咖啡：" + price);
        return price;
    }

}
