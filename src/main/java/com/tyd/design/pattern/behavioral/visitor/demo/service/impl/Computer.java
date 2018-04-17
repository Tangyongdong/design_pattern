package com.tyd.design.pattern.behavioral.visitor.demo.service.impl;

import com.tyd.design.pattern.behavioral.visitor.demo.service.ComputerPart;
import com.tyd.design.pattern.behavioral.visitor.demo.service.ComputerPartVisitor;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
