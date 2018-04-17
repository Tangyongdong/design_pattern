package com.tyd.design.pattern.behavioral.observer.demo.service.impl;

import com.tyd.design.pattern.behavioral.observer.demo.service.Observer;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class HexaObserver extends Observer {

    @Override
    public void update(Integer message) {
        System.out.println("Hex String: " + Integer.toHexString(message));
    }

}
