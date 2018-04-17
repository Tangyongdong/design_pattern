package com.tyd.design.pattern.behavioral.command.demo;

import com.tyd.design.pattern.behavioral.command.demo.service.Broker;
import com.tyd.design.pattern.behavioral.command.demo.service.Stock;
import com.tyd.design.pattern.behavioral.command.demo.service.impl.BuyStock;
import com.tyd.design.pattern.behavioral.command.demo.service.impl.SellStock;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
