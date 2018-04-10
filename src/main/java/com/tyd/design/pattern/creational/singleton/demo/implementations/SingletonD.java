package com.tyd.design.pattern.creational.singleton.demo.implementations;

/**
 * Created by tangyongdong on 2018/4/10
 *
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 安全且在多线程情况下能保持高性能
 */
public class SingletonD {
    private volatile static SingletonD instance;
    private SingletonD(){}
    public static SingletonD getInstance(){
        if(instance == null){
            synchronized (SingletonD.class){
                if(instance == null){
                    instance = new SingletonD();
                }
            }
        }
        return instance;
    }
}
