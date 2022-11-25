package org.example.model;
import org.example.model.constants.Colour;
import org.example.model.constants.Discount;

public class Apple extends Food{
    String colour;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.colour = color;
    }

    @Override
    public double getDiscount(){
        if (colour.equals(Colour.RED)){
            return Discount.GET_DISCOUNT;
        }
        return 0;
    }
}
