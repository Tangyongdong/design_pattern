package com.tyd.design.pattern.creational.builder.demo.service;

import com.tyd.design.pattern.creational.builder.demo.service.impl.ChickenBurger;
import com.tyd.design.pattern.creational.builder.demo.service.impl.Coke;
import com.tyd.design.pattern.creational.builder.demo.service.impl.Pepsi;
import com.tyd.design.pattern.creational.builder.demo.service.impl.VegBurger;

/**
 * Created by tangyongdong on 2018/4/10
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
