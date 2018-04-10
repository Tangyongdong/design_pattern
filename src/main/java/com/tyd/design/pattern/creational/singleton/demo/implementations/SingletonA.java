package com.tyd.design.pattern.creational.singleton.demo.implementations;

/**
 * Created by tangyongdong on 2018/4/10
 *
 * 懒汉式，线程不安全
 *
 */
public class SingletonA {
    private static SingletonA instance;
    private SingletonA(){}
    public static SingletonA getInstance(){
        if(instance == null){
            instance = new SingletonA();
        }
        return instance;
    }
}
