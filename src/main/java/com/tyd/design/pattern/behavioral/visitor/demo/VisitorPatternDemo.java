package com.tyd.design.pattern.behavioral.visitor.demo;

import com.tyd.design.pattern.behavioral.visitor.demo.service.ComputerPart;
import com.tyd.design.pattern.behavioral.visitor.demo.service.impl.Computer;
import com.tyd.design.pattern.behavioral.visitor.demo.service.impl.ComputerPartDisplayVisitor;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
