package com.tyd.design.pattern.structural.decorator.demo1.service.impl;

import com.tyd.design.pattern.structural.decorator.demo1.service.Shape;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
