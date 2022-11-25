package ru.yandex.praktikum.workshop.service;

import ru.yandex.praktikum.workshop.model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public void setProducts(Food[] products) {
        this.products = products;
    }

    public Food[] getProducts() {
        return products;
    }

    //получить общую сумму товаров в корзине без скидки
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++){
            totalPrice = totalPrice + products[i].getTotalPrice();
        }

        return totalPrice;
    }

    //получить общую сумму товаров в корзине со скидкой
    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++){
            totalPrice = totalPrice + products[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }

    /*
    //получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getTotalVegeterianPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++){
            if
        }
    }
     */
}
