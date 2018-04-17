package com.tyd.design.pattern.behavioral.state.demo;

import com.tyd.design.pattern.behavioral.state.demo.service.Context;
import com.tyd.design.pattern.behavioral.state.demo.service.impl.StartState;
import com.tyd.design.pattern.behavioral.state.demo.service.impl.StopState;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
