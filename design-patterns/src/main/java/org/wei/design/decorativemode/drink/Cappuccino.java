package org.wei.design.decorativemode.drink;

/**
 * 卡布奇诺
 */
public class Cappuccino extends Coffee{
    public Cappuccino() {
        setDescription("Cappuccino");
        setPrice(2.0);
    }
    @Override
    public double cost() {
        return price;
    }
}
