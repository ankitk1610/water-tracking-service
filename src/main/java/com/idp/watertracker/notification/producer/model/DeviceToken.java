package com.idp.watertracker.notification.producer.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class DeviceToken {

    @Id
    private String id;

    private String username;
    private String deviceId;
    private String platform;
    private String version;
    private String deviceToken;
}
