package com.tyd.design.pattern.structural.bridge.demo.service.impl;

import com.tyd.design.pattern.structural.bridge.demo.service.DrawAPI;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
