package org.example.logging;

import org.example.logging.BaseLogger;

public class SmsLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("SMS logged : " + message);
    }
}
