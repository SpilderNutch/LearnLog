package com.yutian.log4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloLog4j2 {


    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger("HelloLog4j2");
        //Logger logger = LogManager.getLogger(HelloLog4j2.class);

        logger.info("hello World....");

        logger.info("Here is the log...");

    }
}
