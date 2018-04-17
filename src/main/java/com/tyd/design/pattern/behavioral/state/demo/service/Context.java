package com.tyd.design.pattern.behavioral.state.demo.service;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
