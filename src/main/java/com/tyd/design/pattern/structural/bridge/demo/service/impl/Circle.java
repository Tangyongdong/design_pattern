package com.tyd.design.pattern.structural.bridge.demo.service.impl;

import com.tyd.design.pattern.structural.bridge.demo.service.DrawAPI;
import com.tyd.design.pattern.structural.bridge.demo.service.Shape;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
