package com.tyd.design.pattern.creational.abstractfactory.demo.service;

import com.tyd.design.pattern.creational.abstractfactory.demo.service.impl.Circle;
import com.tyd.design.pattern.creational.abstractfactory.demo.service.impl.Rectangle;
import com.tyd.design.pattern.creational.abstractfactory.demo.service.impl.Square;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
