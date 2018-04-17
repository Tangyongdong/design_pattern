package com.tyd.design.pattern.behavioral.interpreter.demo.service.impl;

import com.tyd.design.pattern.behavioral.interpreter.demo.service.Expression;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
