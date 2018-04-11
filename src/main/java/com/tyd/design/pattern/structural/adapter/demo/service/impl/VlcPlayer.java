package com.tyd.design.pattern.structural.adapter.demo.service.impl;

import com.tyd.design.pattern.structural.adapter.demo.service.AdvancedMediaPlayer;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
