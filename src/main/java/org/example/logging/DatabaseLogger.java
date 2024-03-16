package org.example.logging;

import org.example.logging.BaseLogger;

public class DatabaseLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("Database Logged : " +message);
    }
}
