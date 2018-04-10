package com.tyd.design.pattern.creational.builder.demo.service.impl;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
