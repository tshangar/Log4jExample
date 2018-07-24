package com.tshangar.example;

import org.apache.log4j.Logger;

public class Log4jHelloWorld {
    private static final Logger logger = Logger.getLogger(Log4jHelloWorld.class);

    public static void main(String[] args) {
        logger.debug("Hello World!");

        logger.info("Log4j Info is enabled");
        logger.debug("Log4j Debug is enabled");
        logger.warn("Log4j Warning is enabled");
        logger.error("Log4j Error is enabled");
    }
}
