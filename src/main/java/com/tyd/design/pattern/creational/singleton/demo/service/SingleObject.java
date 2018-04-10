package com.tyd.design.pattern.creational.singleton.demo.service;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("Hello World!");
    }
}
