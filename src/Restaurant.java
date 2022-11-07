package src;

import src.kitchen.Cook;
import src.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(1);
        Cook cook = new Cook("Jon");
        tablet.addObserver(cook);

        Waiter waiter = new Waiter();
        cook.addObserver(waiter);


        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
    }
}
