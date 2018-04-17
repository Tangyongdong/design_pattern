package com.tyd.design.pattern.behavioral.command.demo.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
