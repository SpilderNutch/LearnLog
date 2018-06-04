package com.yutian;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogBack {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("com.logback.HelloLogBack");
        logger.debug("Hello world.");


        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

    }


}
