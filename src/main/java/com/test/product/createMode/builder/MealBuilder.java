package com.test.product.createMode.builder;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 14:30 2019-04-17
 * @Modify By:
 */
public class MealBuilder {


    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }


}
