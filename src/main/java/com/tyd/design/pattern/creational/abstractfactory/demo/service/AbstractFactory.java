package com.tyd.design.pattern.creational.abstractfactory.demo.service;

/**
 * Created by tangyongdong on 2018/4/10
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
