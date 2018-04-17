package com.tyd.design.pattern.behavioral.visitor.demo.service;

/**
 * Created by tangyongdong on 2018/4/17
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
