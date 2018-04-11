package com.tyd.design.pattern.structural.decorator.demo1.service.impl;

import com.tyd.design.pattern.structural.decorator.demo1.service.Shape;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class ShapeDecorator implements Shape {
    @Override
    public void draw() {
        decoratedShape.draw();
    }

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
}
