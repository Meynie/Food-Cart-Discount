package org.example.model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian ;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian  = isVegetarian;
    }

    public double getTotalPriceWithDiscount(){
        if (getDiscount() == 0){
            return getTotalPrice();
        }
        return getTotalPrice() / 100 * (100 - getDiscount());
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getVegPrice() {
        if (isVegetarian) {
            return getTotalPrice();
        }
        return 0;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

}
