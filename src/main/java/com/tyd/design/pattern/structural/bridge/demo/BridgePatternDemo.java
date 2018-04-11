package com.tyd.design.pattern.structural.bridge.demo;

import com.tyd.design.pattern.structural.bridge.demo.service.Shape;
import com.tyd.design.pattern.structural.bridge.demo.service.impl.Circle;
import com.tyd.design.pattern.structural.bridge.demo.service.impl.GreenCircle;
import com.tyd.design.pattern.structural.bridge.demo.service.impl.RedCircle;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
