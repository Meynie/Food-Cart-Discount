package org.example;

import org.example.model.Meat;
import org.example.model.Apple;
import org.example.model.Food;
import org.example.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] food = {
                new Meat(5, 100),
                new Apple(10, 50, "red"),
                new Apple(8, 60, "green")
        };
        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getTotalVegeterianPrice());
    }
}
