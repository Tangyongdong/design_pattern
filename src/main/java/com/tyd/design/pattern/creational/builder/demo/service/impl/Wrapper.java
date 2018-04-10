package com.tyd.design.pattern.creational.builder.demo.service.impl;

import com.tyd.design.pattern.creational.builder.demo.service.Packing;

/**
 * Created by tangyongdong on 2018/4/10
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
