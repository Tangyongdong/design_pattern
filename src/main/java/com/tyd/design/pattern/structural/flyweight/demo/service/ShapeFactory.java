package com.tyd.design.pattern.structural.flyweight.demo.service;

import com.tyd.design.pattern.structural.flyweight.demo.service.impl.Circle;

import java.util.HashMap;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
