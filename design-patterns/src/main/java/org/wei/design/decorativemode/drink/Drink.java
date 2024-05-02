package org.wei.design.decorativemode.drink;

import lombok.Data;

/**
 * 饮料
 */
@Data
public abstract class Drink{
    protected double price;
    protected String description;
    public abstract double cost();

}
