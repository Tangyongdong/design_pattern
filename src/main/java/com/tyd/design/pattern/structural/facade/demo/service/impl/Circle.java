package com.tyd.design.pattern.structural.facade.demo.service.impl;

import com.tyd.design.pattern.structural.facade.demo.service.Shape;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
