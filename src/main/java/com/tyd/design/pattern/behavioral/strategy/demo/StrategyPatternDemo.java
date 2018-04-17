package com.tyd.design.pattern.behavioral.strategy.demo;

import com.tyd.design.pattern.behavioral.strategy.demo.service.Context;
import com.tyd.design.pattern.behavioral.strategy.demo.service.impl.OperationAdd;
import com.tyd.design.pattern.behavioral.strategy.demo.service.impl.OperationMultiply;
import com.tyd.design.pattern.behavioral.strategy.demo.service.impl.OperationSubstract;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
