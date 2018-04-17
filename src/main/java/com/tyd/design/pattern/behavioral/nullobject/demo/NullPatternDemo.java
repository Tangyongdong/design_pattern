package com.tyd.design.pattern.behavioral.nullobject.demo;

import com.tyd.design.pattern.behavioral.nullobject.demo.service.AbstractCustomer;
import com.tyd.design.pattern.behavioral.nullobject.demo.service.CustomerFactory;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
