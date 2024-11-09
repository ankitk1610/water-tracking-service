package com.idp.watertracker.notification.producer.model.kafka;

import com.idp.watertracker.notification.producer.model.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventMetadata {

    private String transactionId;
    private NotificationType type;

}
