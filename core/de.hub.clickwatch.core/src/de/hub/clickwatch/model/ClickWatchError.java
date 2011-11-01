package de.hub.clickwatch.model;

import java.util.Date;

public class ClickWatchError {

    private final String message;
    private final Throwable exception;
    private final long timestamp;
    
    public ClickWatchError(String message, Throwable exception) {
        super();
        this.message = message;
        this.exception = exception;
        this.timestamp = new Date().getTime();
    }

    public String getMessage() {
        return message;
    }

    public Throwable getException() {
        return exception;
    }

    public long getTimestamp() {
        return timestamp;
    }
  
    @Override
    public String toString() {
        return message + "(" + exception.getClass().getSimpleName() + ")";
    }
}
