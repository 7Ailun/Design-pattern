package org.wei.design.decorativemode.batching;

import org.wei.design.decorativemode.Decorator;
import org.wei.design.decorativemode.drink.Drink;

/**
 * 牛奶
 */
public class Milk extends Decorator {

    private final double PRICE = 2;
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        System.out.println("添加牛奶，花费：" + PRICE);
        return PRICE + super.cost();
    }
}
