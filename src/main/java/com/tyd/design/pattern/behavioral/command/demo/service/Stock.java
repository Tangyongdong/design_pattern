package com.tyd.design.pattern.behavioral.command.demo.service;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] sold");
    }
}
