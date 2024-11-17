package com.idp.watertracker.watertrackerservice.exception;

public class DeviceTokenNotFoundException extends RuntimeException {
    public DeviceTokenNotFoundException(String thisEntryDoesNotExist) {
        super(thisEntryDoesNotExist);
    }
}