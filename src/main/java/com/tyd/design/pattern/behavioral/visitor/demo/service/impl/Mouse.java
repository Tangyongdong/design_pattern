package com.tyd.design.pattern.behavioral.visitor.demo.service.impl;

import com.tyd.design.pattern.behavioral.visitor.demo.service.ComputerPart;
import com.tyd.design.pattern.behavioral.visitor.demo.service.ComputerPartVisitor;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
