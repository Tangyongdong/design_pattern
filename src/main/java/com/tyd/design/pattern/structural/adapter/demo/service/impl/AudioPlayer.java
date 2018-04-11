package com.tyd.design.pattern.structural.adapter.demo.service.impl;

import com.tyd.design.pattern.structural.adapter.demo.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class AudioPlayer implements MediaPlayer {

    @Autowired
    private MediaPlayer mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
