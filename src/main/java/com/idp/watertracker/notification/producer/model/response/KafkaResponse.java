package com.idp.watertracker.notification.producer.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KafkaResponse {

    private String transactionId;
    private String notificationId;
}
