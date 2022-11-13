package src.kitchen;

import src.ConsoleHelper;
import src.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    public int getTotalCookingTime(){
        int totalTime = 0;
        for (Dish dish :
                dishes) {
            totalTime += dish.getDuration();
        }

        return totalTime;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (dishes.size() == 0) return result.toString();
        result.append("Your order: [" + dishes.get(0));

        for (int i = 1; i < dishes.size(); i++) {
            result.append(", " + dishes.get(i).name());
        }
        result.append("] of " + tablet);
        result.append(", cooking time " + getTotalCookingTime() + "min");
        return result.toString();
    }
}
