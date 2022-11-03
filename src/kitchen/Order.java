package src.kitchen;

import java.util.List;

import src.Tablet;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) {
        this.tablet = tablet;
    }
}
