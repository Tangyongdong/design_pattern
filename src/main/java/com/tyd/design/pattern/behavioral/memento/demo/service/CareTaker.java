package com.tyd.design.pattern.behavioral.memento.demo.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
