package com.tyd.design.pattern.behavioral.command.demo.service.impl;

import com.tyd.design.pattern.behavioral.command.demo.service.Order;
import com.tyd.design.pattern.behavioral.command.demo.service.Stock;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
