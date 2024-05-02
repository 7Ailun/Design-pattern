package org.wei.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 原型🐏
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable{
    private String name;
    private double age;

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
