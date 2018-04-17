package com.tyd.design.pattern.behavioral.interpreter.demo;

import com.tyd.design.pattern.behavioral.interpreter.demo.service.Expression;
import com.tyd.design.pattern.behavioral.interpreter.demo.service.impl.AndExpression;
import com.tyd.design.pattern.behavioral.interpreter.demo.service.impl.OrExpression;
import com.tyd.design.pattern.behavioral.interpreter.demo.service.impl.TerminalExpression;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class InterpreterPatternDemo {
    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
