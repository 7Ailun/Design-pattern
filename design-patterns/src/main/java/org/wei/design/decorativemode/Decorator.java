package org.wei.design.decorativemode;

import org.wei.design.decorativemode.drink.Drink;

/**
 * 装饰器
 */
public abstract class Decorator extends Drink {
    private Drink drink;
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    public double cost() {
        return drink.cost();
    }
}
