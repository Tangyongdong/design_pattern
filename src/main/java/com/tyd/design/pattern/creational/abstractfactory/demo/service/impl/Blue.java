package com.tyd.design.pattern.creational.abstractfactory.demo.service.impl;

import com.tyd.design.pattern.creational.abstractfactory.demo.service.Color;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
