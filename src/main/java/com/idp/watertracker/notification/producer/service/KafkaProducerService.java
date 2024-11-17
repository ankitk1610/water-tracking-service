//package com.idp.watertracker.notification.producer.service;
//
//import com.google.gson.Gson;
//import com.idp.watertracker.notification.producer.model.enums.NotificationType;
//import com.idp.watertracker.notification.producer.model.kafka.event.PushNotificationEvent;
//import com.idp.watertracker.notification.producer.model.kafka.KafkaEvent;
//import com.idp.watertracker.notification.producer.utils.PropertyUtils;
//import org.apache.coyote.BadRequestException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducerService {
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @Autowired
//    private PropertyUtils propertyUtils;
//
//    @Autowired
//    private Gson gson;
//
//    public void sendMessageToKafkaTopic(KafkaEvent<PushNotificationEvent> message) throws BadRequestException {
//        kafkaTemplate.send(getTopicName(message.getMeta().getType()), gson.toJson(message));
//    }
//
//    private String getTopicName(NotificationType type) throws BadRequestException {
//        switch (type) {
//            case PUSH:
//                return propertyUtils.getPushNotificationTopic();
//            default:throw new BadRequestException("Invalid Notification Type");
//        }
//    }
//}
