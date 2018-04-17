package com.tyd.design.pattern.behavioral.iterator.demo;

import com.tyd.design.pattern.behavioral.iterator.demo.service.Iterator;
import com.tyd.design.pattern.behavioral.iterator.demo.service.impl.NameRepository;

/**
 * Created by tangyongdong on 2018/4/16
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}

