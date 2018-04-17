package com.tyd.design.pattern.behavioral.nullobject.demo.service;

import com.tyd.design.pattern.behavioral.nullobject.demo.service.impl.NullCustomer;
import com.tyd.design.pattern.behavioral.nullobject.demo.service.impl.RealCustomer;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
