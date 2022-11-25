package ru.yandex.praktikum.workshop.model;

public class Iphone extends Food {
    String model;

    public Iphone(int amount, double price, String model) {
        super(amount, price, false);
        this.model = model;
    }

    @Override
    public double getDiscount() {
        if (model.equals("13")) {
            return 80;
        }
        return 0;
    }
}
