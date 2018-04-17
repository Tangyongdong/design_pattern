package com.tyd.design.pattern.behavioral.command.demo.service.impl;

import com.tyd.design.pattern.behavioral.command.demo.service.Order;
import com.tyd.design.pattern.behavioral.command.demo.service.Stock;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
