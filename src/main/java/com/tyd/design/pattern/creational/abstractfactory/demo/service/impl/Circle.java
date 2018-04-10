package com.tyd.design.pattern.creational.abstractfactory.demo.service.impl;

import com.tyd.design.pattern.creational.abstractfactory.demo.service.Shape;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
