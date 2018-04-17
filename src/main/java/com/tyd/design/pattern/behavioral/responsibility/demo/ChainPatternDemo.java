package com.tyd.design.pattern.behavioral.responsibility.demo;

import com.tyd.design.pattern.behavioral.responsibility.demo.service.AbstractLogger;
import com.tyd.design.pattern.behavioral.responsibility.demo.service.impl.ConsoleLogger;
import com.tyd.design.pattern.behavioral.responsibility.demo.service.impl.ErrorLogger;
import com.tyd.design.pattern.behavioral.responsibility.demo.service.impl.FileLogger;

/**
 * Created by tangyongdong on 2018/4/12
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
