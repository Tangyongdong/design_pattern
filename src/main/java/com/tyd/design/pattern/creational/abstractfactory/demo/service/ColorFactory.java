package com.tyd.design.pattern.creational.abstractfactory.demo.service;

import com.tyd.design.pattern.creational.abstractfactory.demo.service.impl.Blue;
import com.tyd.design.pattern.creational.abstractfactory.demo.service.impl.Green;
import com.tyd.design.pattern.creational.abstractfactory.demo.service.impl.Red;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
