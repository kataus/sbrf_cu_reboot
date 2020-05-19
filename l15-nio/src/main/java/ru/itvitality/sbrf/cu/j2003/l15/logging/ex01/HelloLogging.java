package ru.itvitality.sbrf.cu.j2003.l15.logging.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloLogging {
    private static Logger logger = LoggerFactory.getLogger(HelloLogging.class);

    public static void main(String[] args) {
        new HelloLogging().log();
    }

    private void log() {
        String value = "test";

/*      Устаревший вариант
        if (logger.isDebugEnabled()) {
            logger.error("Hello logging:" + value);
        }
*/

        //Современный вариант
        logger.error("Hello logging:{}", value);

        try {
            Thread.sleep(3_000);
            throw new RuntimeException("exception for log");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            logger.error("exception log:", e);
        }
    }
}
