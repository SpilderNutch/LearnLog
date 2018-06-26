package com.yutian.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogBack {

    public static void main(String[] args) {

        //ACCEPT,DENY,NEUTRAL

        Logger logger = LoggerFactory.getLogger("com.logback.HelloLogBack");
        logger.info("sample 11");
        logger.info("sampl");
        logger.info("ERROR msg");
        logger.debug("Hello world.");

        logger.info("===============>Filter");
        logger.info("ACCEPT");
        logger.info("DENY");
        logger.info("NEUTRAL");



        //LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        //StatusPrinter.print(lc);

    }


}
