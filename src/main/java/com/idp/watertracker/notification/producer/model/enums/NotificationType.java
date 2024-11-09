package com.idp.watertracker.notification.producer.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum NotificationType {

    PUSH;

    @JsonCreator
    public static NotificationType fromValue(String value) {
        for (NotificationType notiificationType : NotificationType.values()) {
            if (notiificationType.name().equalsIgnoreCase(value)) {
                return notiificationType;
            }
        }
        throw new IllegalArgumentException("Invalid Notification Type: " + value);
    }
}