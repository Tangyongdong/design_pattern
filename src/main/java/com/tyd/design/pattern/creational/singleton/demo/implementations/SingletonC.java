package com.tyd.design.pattern.creational.singleton.demo.implementations;

/**
 * Created by tangyongdong on 2018/4/10
 *
 * 饿汉式
 */
public class SingletonC {
    private static SingletonC instance = new SingletonC();
    private SingletonC(){}
    public static SingletonC getInstance(){
        return instance;
    }
}
