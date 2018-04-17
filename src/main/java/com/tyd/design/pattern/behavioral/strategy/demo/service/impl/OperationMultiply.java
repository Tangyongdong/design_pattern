package com.tyd.design.pattern.behavioral.strategy.demo.service.impl;

import com.tyd.design.pattern.behavioral.strategy.demo.service.Strategy;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
