package com.tyd.design.pattern.behavioral.interpreter.demo.service.impl;

import com.tyd.design.pattern.behavioral.interpreter.demo.service.Expression;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
