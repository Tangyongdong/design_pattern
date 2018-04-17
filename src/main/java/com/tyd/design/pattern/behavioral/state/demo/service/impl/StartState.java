package com.tyd.design.pattern.behavioral.state.demo.service.impl;

import com.tyd.design.pattern.behavioral.state.demo.service.Context;
import com.tyd.design.pattern.behavioral.state.demo.service.State;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
