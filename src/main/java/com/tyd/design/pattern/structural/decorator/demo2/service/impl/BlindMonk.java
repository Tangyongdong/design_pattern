package com.tyd.design.pattern.structural.decorator.demo2.service.impl;

import com.tyd.design.pattern.structural.decorator.demo2.service.Hero;

/**
 * Created by tangyongdong on 2018/4/11
 */
//具体英雄盲僧
public class BlindMonk implements Hero{
    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能！");
    }
}
