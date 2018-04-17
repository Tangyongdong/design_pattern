package com.tyd.design.pattern.behavioral.nullobject.demo.service.impl;

import com.tyd.design.pattern.behavioral.nullobject.demo.service.AbstractCustomer;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
