package com.tyd.design.pattern.behavioral.visitor.demo.service.impl;

import com.tyd.design.pattern.behavioral.visitor.demo.service.ComputerPartVisitor;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
