package com.tyd.design.pattern.structural.adapter.demo.service.impl;

import com.tyd.design.pattern.structural.adapter.demo.service.AdvancedMediaPlayer;
import com.tyd.design.pattern.structural.adapter.demo.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class MediaAdapter implements MediaPlayer {

    @Autowired
    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
}
