package com.vino.lmax;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo App
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        LMAXWriter lmaxWriter = new LMAXWriter();
        logger.info("Initializing lmax disruptor.");
        lmaxWriter.setRingBufferSize(7); //deliberately set. Final ring buffer size would be 8.
        lmaxWriter.init();

        // submit messages to write concurrently using disruptor
        for (int i = 0; i < 10; i++) {
            lmaxWriter.submitMessage("Message Sequence " + i);
        }

        logger.info("All message submitted.");

        lmaxWriter.close();
        logger.info("Program executed successfully.");
    }
}
