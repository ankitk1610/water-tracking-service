package com.idp.watertracker.notification.producer.model.kafka.event;

import lombok.Data;

@Data
public class PushNotificationEvent {

    private String title;
    private String body;
    private String contentAvailable;
    private String priority;
    private String targetToken;

}
