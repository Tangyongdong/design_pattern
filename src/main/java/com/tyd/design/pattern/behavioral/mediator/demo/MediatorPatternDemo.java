package com.tyd.design.pattern.behavioral.mediator.demo;

import com.tyd.design.pattern.behavioral.mediator.demo.entity.User;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
