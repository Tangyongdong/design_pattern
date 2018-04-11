package com.tyd.design.pattern.structural.decorator.demo1;

import com.tyd.design.pattern.structural.decorator.demo1.service.Shape;
import com.tyd.design.pattern.structural.decorator.demo1.service.impl.Circle;
import com.tyd.design.pattern.structural.decorator.demo1.service.impl.Rectangle;
import com.tyd.design.pattern.structural.decorator.demo1.service.impl.RedShapeDecorator;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
