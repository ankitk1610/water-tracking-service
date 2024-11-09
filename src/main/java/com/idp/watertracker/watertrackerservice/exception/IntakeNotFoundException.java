package com.idp.watertracker.watertrackerservice.exception;

public class IntakeNotFoundException extends RuntimeException {
    public IntakeNotFoundException(String thisEntryDoesNotExist) {
        super(thisEntryDoesNotExist);
    }
}