package com.tyd.design.pattern.creational.singleton.demo.implementations;

/**
 * Created by tangyongdong on 2018/4/10
 *
 * 懒汉式，线程安全
 */
public class SingletonB {
    private static SingletonB instance;
    private SingletonB(){}
    public static synchronized SingletonB getInstance(){
        if(instance == null){
            instance = new SingletonB();
        }
        return instance;
    }
}
