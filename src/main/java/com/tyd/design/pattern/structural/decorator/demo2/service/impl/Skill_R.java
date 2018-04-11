package com.tyd.design.pattern.structural.decorator.demo2.service.impl;

import com.tyd.design.pattern.structural.decorator.demo2.service.Hero;

/**
 * Created by tangyongdong on 2018/4/11
 */
//ConreteDecorator 技能：R
public class Skill_R extends Skills{

    private String skillName;

    public Skill_R(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能R:" +skillName);
        super.learnSkills();
    }
}