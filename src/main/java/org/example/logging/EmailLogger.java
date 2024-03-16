package org.example.logging;

import org.example.logging.BaseLogger;

public class EmailLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Email logged : " + message);
    }
}
