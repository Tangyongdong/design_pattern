package com.tyd.design.pattern.behavioral.mediator.demo.entity;

import com.tyd.design.pattern.behavioral.mediator.demo.service.ChatRoom;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
