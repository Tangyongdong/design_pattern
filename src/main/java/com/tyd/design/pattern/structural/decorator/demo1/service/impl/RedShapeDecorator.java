package com.tyd.design.pattern.structural.decorator.demo1.service.impl;

import com.tyd.design.pattern.structural.decorator.demo1.service.Shape;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
