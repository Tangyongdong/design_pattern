package com.tyd.design.pattern.behavioral.mediator.demo.service;

import com.tyd.design.pattern.behavioral.mediator.demo.entity.User;

import java.util.Date;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
