package com.tyd.design.pattern.structural.facade.demo.service;

import com.tyd.design.pattern.structural.facade.demo.service.impl.Circle;
import com.tyd.design.pattern.structural.facade.demo.service.impl.Rectangle;
import com.tyd.design.pattern.structural.facade.demo.service.impl.Square;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
