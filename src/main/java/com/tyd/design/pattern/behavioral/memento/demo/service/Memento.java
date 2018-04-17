package com.tyd.design.pattern.behavioral.memento.demo.service;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
