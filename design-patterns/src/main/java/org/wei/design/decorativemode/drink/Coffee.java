package org.wei.design.decorativemode.drink;

/**
 * 缓冲层
 */
public class Coffee extends Drink {


    @Override
    public double cost() {
        return super.getPrice();
    }
}
