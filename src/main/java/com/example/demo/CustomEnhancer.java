package com.example.demo;

import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.LoggingEnhancer;

public class CustomEnhancer implements LoggingEnhancer {

    @Override
    public void enhanceLogEntry(LogEntry.Builder logEntry) {
        logEntry.addLabel("test-label-1", "test-value-1");
    }

}
