package org.example.service;

import org.example.model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    //получить общую сумму товаров в корзине без скидки
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++){
            totalPrice = totalPrice + food[i].getTotalPrice();
        }

        return totalPrice;
    }

    //получить общую сумму товаров в корзине со скидкой
    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++){
            totalPrice = totalPrice + food[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }


    //получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getTotalVegeterianPrice() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++){
            totalPrice = totalPrice + food[i].getVegPrice();
        }
        return totalPrice;
    }

}
