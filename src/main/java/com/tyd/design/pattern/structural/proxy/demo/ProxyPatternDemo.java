package com.tyd.design.pattern.structural.proxy.demo;

import com.tyd.design.pattern.structural.proxy.demo.service.Image;
import com.tyd.design.pattern.structural.proxy.demo.service.impl.ProxyImage;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
