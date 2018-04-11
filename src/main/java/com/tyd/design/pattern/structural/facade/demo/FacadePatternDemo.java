package com.tyd.design.pattern.structural.facade.demo;

import com.tyd.design.pattern.structural.facade.demo.service.ShapeMaker;

/**
 * Created by tangyongdong on 2018/4/11
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
