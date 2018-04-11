package com.tyd.design.pattern.structural.proxy.demo.service.impl;

import com.tyd.design.pattern.structural.proxy.demo.service.Image;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
