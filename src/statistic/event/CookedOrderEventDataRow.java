package src.statistic.event;

import src.kitchen.Dish;

import java.util.Date;
import java.util.List;

public class CookedOrderEventDataRow implements EventDataRow{
    private String tabletName;
    private String cookName; //cooker name
    private int cookingTimeSeconds;
    private List<Dish> cookingDishes;
    private Date currentDate;

    public CookedOrderEventDataRow(String tabletName, String cookName, int cookingTimeSeconds, List<Dish> cookingDishes) {
        this.tabletName = tabletName;
        this.cookName = cookName;
        this.cookingTimeSeconds = cookingTimeSeconds;
        this.cookingDishes = cookingDishes;
        currentDate = new Date();
    }
}