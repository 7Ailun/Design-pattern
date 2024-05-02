package org.wei.design.decorativemode.drink;

/**
 * 美式咖啡
 */
public class Americano extends Coffee {
    public Americano() {
        setDescription("美式咖啡");
        setPrice(5.0);
    }

    @Override
    public double cost() {
        return price;
    }
}
