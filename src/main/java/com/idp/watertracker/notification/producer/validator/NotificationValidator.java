package com.idp.watertracker.notification.producer.validator;

import com.idp.watertracker.notification.producer.model.request.Notification;
import com.idp.watertracker.notification.producer.model.enums.NotificationType;
import com.idp.watertracker.notification.producer.model.kafka.event.PushNotificationEvent;
import org.springframework.stereotype.Component;

@Component
public class NotificationValidator {

    public  void validate(Notification notification) {
        if(NotificationType.PUSH.compareTo(notification.getType()) == 0) {
            validatePushNotification(notification.getPushData());
        }
    }

    private  void validatePushNotification(PushNotificationEvent metadata) {

//        TODO: add validation checks



    }
}
