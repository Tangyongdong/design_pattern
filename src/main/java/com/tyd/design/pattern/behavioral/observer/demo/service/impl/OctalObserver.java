package com.tyd.design.pattern.behavioral.observer.demo.service.impl;

import com.tyd.design.pattern.behavioral.observer.demo.service.Observer;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class OctalObserver extends Observer {

    @Override
    public void update(Integer message) {
        System.out.println("Octal String: " + Integer.toOctalString(message));
    }
}
