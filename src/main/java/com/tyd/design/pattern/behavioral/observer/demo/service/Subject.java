package com.tyd.design.pattern.behavioral.observer.demo.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers(state);
    }

    public void addAttach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(Integer state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
