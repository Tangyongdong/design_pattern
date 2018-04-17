package com.tyd.design.pattern.behavioral.visitor.demo.service;

import com.tyd.design.pattern.behavioral.visitor.demo.service.impl.Computer;
import com.tyd.design.pattern.behavioral.visitor.demo.service.impl.Keyboard;
import com.tyd.design.pattern.behavioral.visitor.demo.service.impl.Monitor;
import com.tyd.design.pattern.behavioral.visitor.demo.service.impl.Mouse;

/**
 * Created by tangyongdong on 2018/4/17
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
