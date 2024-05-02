package org.wei.design.decorativemode;

import org.wei.design.decorativemode.batching.Milk;
import org.wei.design.decorativemode.drink.Drink;
import org.wei.design.decorativemode.drink.Espresso;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
         Drink espresso = new Espresso();
         espresso = new Milk(espresso);
         espresso = new Milk(espresso);
         double cost = espresso.cost();
        System.out.println("总费用 = " + cost);
    }
    /**
     * 源码分析
     */

    public void test() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\All_Code"));
        dis.read();
    }
}
