package org.example.model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian ;

    protected Food(int amount, double price, boolean isFresh) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian  = isFresh;
    }

    public double getTotalPriceWithDiscount(){
        //double totalPrice = 0;
        if (getDiscount() == 0){
            return getTotalPrice();
        }
        return getTotalPrice() / 100 * (100 - getDiscount());
    }

    public double getTotalPrice() {
        return amount * price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

}
