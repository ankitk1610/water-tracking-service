package com.idp.watertracker.notification.producer.model.request;

import com.idp.watertracker.notification.producer.model.enums.NotificationType;
import com.idp.watertracker.notification.producer.model.kafka.event.PushNotificationEvent;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Notification {

    @Id
    private String id = UUID.randomUUID().toString();

    private String requestId;

    private NotificationType type;

    private PushNotificationEvent pushData;

    private String status;


}
