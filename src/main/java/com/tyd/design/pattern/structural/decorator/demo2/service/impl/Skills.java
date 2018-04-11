package com.tyd.design.pattern.structural.decorator.demo2.service.impl;

import com.tyd.design.pattern.structural.decorator.demo2.service.Hero;

/**
 * Created by tangyongdong on 2018/4/11
 */
//Decorator 技能栏
public class Skills implements Hero {
    //持有一个英雄对象接口
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if(hero != null)
            hero.learnSkills();
    }
}
