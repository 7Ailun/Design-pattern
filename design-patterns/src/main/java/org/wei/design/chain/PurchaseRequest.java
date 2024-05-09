package org.wei.design.chain;

public class PurchaseRequest {
    private int number;
    private double price;

    public PurchaseRequest(int number, double price) {
        this.number = number;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
