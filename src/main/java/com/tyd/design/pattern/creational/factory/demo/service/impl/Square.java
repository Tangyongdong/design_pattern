package com.tyd.design.pattern.creational.factory.demo.service.impl;

import com.tyd.design.pattern.creational.factory.demo.service.Shape;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
