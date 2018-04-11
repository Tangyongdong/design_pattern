package com.tyd.design.pattern.structural.adapter.demo.service.impl;

import com.tyd.design.pattern.structural.adapter.demo.service.AdvancedMediaPlayer;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
