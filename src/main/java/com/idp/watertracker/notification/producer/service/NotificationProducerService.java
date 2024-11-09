package com.idp.watertracker.notification.producer.service;

import com.idp.watertracker.notification.producer.model.request.Notification;
import com.idp.watertracker.notification.producer.model.response.KafkaResponse;

public interface NotificationProducerService {

    KafkaResponse sendNotification(Notification notification);



}
