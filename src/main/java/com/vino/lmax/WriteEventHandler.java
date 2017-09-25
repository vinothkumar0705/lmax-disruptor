package com.vino.lmax;

import com.lmax.disruptor.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Vinothkumar Selvaraj.
 */
public class WriteEventHandler implements EventHandler<WriteEvent> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void onEvent(WriteEvent writeEvent, long sequence, boolean endOfBatch) throws Exception {
        if (writeEvent != null && writeEvent.get() != null) {
            String message = writeEvent.get();

            // Put you business logic here.
            // here it will print only the submitted message.
            logger.error(message + " processed.");
        }
    }
}
