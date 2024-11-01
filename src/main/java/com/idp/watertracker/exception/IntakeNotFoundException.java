package com.idp.watertracker.exception;

public class IntakeNotFoundException extends RuntimeException {
    public IntakeNotFoundException(String thisEntryDoesNotExist) {
        super(thisEntryDoesNotExist);
    }
}
