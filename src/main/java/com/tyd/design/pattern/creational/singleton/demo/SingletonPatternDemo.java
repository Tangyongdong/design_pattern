package com.tyd.design.pattern.creational.singleton.demo;

import com.tyd.design.pattern.creational.singleton.demo.service.SingleObject;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.show();
    }
}
