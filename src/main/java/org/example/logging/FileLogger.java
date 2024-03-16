package org.example.logging;

import org.example.logging.BaseLogger;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandı : " + message);
    }
}
