package com.tyd.design.pattern.structural.facade.demo.service.impl;

import com.tyd.design.pattern.structural.facade.demo.service.Shape;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
