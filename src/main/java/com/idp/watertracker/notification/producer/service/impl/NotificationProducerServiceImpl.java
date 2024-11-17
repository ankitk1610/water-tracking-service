package com.idp.watertracker.notification.producer.service.impl;

import com.idp.watertracker.notification.producer.model.request.Notification;
import com.idp.watertracker.notification.producer.model.kafka.event.PushNotificationEvent;
import com.idp.watertracker.notification.producer.model.kafka.EventMetadata;
import com.idp.watertracker.notification.producer.model.kafka.KafkaEvent;
import com.idp.watertracker.notification.producer.model.response.KafkaResponse;
import com.idp.watertracker.notification.producer.service.NotificationProducerService;
import com.idp.watertracker.notification.producer.validator.NotificationValidator;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducerServiceImpl implements NotificationProducerService {


    @Autowired
    private NotificationValidator notificationValidator;

//    @Autowired
//    private KafkaProducerService kafkaProducerService;

    @Override
    public KafkaResponse sendNotification(Notification notification) {

        notificationValidator.validate(notification);
        
//        return pushNotificationToKafkaTopic(notification);
        return null;

    }

//    private KafkaResponse pushNotificationToKafkaTopic(Notification notification) {
//
//        KafkaEvent<PushNotificationEvent> kafkaEvent = new KafkaEvent<>();
//        kafkaEvent.setMeta(new EventMetadata(notification.getRequestId(), notification.getType()));
//        kafkaEvent.setData(notification.getPushData());
//
//        try {
//            kafkaProducerService.sendMessageToKafkaTopic(kafkaEvent);
//        } catch (BadRequestException e) {
//            throw new RuntimeException(e);
//        }
//
//        return new KafkaResponse(notification.getRequestId(), notification.getId());
//
//
//    }
}
