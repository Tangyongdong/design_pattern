package com.tyd.design.pattern.creational.prototype.demo;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
