package com.tyd.design.pattern.creational.builder.demo.service.impl;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
