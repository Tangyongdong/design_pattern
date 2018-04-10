package com.tyd.design.pattern.creational.builder.demo.service.impl;

import com.tyd.design.pattern.creational.builder.demo.service.Item;
import com.tyd.design.pattern.creational.builder.demo.service.Packing;

/**
 * Created by tangyongdong on 2018/4/10
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
