package com.tyd.design.pattern.behavioral.observer.demo;

import com.tyd.design.pattern.behavioral.observer.demo.service.Subject;
import com.tyd.design.pattern.behavioral.observer.demo.service.impl.BinaryObserver;
import com.tyd.design.pattern.behavioral.observer.demo.service.impl.HexaObserver;
import com.tyd.design.pattern.behavioral.observer.demo.service.impl.OctalObserver;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver();
        HexaObserver hexaObserver = new HexaObserver();
        OctalObserver octalObserver = new OctalObserver();

        subject.addAttach(binaryObserver);
        subject.addAttach(hexaObserver);
        subject.addAttach(octalObserver);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
