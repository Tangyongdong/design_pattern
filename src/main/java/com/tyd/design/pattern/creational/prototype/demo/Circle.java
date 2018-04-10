package com.tyd.design.pattern.creational.prototype.demo;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
