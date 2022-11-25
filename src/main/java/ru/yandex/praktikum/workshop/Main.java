package ru.yandex.praktikum.workshop;

import ru.yandex.praktikum.workshop.model.Meat;
import ru.yandex.praktikum.workshop.model.Apple;
import ru.yandex.praktikum.workshop.model.Food;
import ru.yandex.praktikum.workshop.service.ShoppingCart;

public class Main {
    // Реализовать корзину ru.yandex.praktikum.workshop.service.ShoppingCart - цена за все товары, цена со скидкой, цена isFresh
    // Реализовать класс Products - кол-во, цена за ед. товара и sFresh
    // Реализовать интерфейса ru.yandex.praktikum.workshop.model.Discountable

    public static void main(String[] args) {
        Food[] products = {
                new Meat(2, 100),
                new Apple(1, 10, "red"),
                new Apple(1, 6, "green")
        };
        ShoppingCart shoppingCart = new ShoppingCart(products);
        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
    }
}
