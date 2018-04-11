package com.tyd.design.pattern.structural.bridge.demo.service;

/**
 * Created by tangyongdong on 2018/4/11
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
