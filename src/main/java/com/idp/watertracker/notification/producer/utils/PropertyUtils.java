package com.idp.watertracker.notification.producer.utils;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class PropertyUtils {

    private String pushNotificationTopic = "idp-push";
}
