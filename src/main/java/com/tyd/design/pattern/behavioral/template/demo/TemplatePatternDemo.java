package com.tyd.design.pattern.behavioral.template.demo;

import com.tyd.design.pattern.behavioral.template.demo.service.Cricket;
import com.tyd.design.pattern.behavioral.template.demo.service.Football;
import com.tyd.design.pattern.behavioral.template.demo.service.Game;

/**
 * Created by tangyongdong on 2018/4/17
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
