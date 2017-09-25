package com.vino.lmax;

import com.lmax.disruptor.EventFactory;

/**
 * @author Vinothkumar Selvaraj.
 */
public class WriteEventFactory implements EventFactory<WriteEvent> {

    public WriteEvent newInstance() {
        return new WriteEvent();
    }
}
