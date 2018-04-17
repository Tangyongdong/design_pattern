package com.tyd.design.pattern.behavioral.nullobject.demo.service.impl;

import com.tyd.design.pattern.behavioral.nullobject.demo.service.AbstractCustomer;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
