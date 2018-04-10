package com.tyd.design.pattern.creational.prototype.demo;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
