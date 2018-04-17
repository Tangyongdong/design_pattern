package com.tyd.design.pattern.behavioral.state.demo.service.impl;

import com.tyd.design.pattern.behavioral.state.demo.service.Context;
import com.tyd.design.pattern.behavioral.state.demo.service.State;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
