package com.tyd.design.pattern.behavioral.responsibility.demo.service.impl;

import com.tyd.design.pattern.behavioral.responsibility.demo.service.AbstractLogger;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
