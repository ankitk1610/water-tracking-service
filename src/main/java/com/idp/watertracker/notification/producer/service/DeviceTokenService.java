package com.idp.watertracker.notification.producer.service;

import com.idp.watertracker.notification.producer.model.DeviceToken;

public interface DeviceTokenService {

    DeviceToken saveDeviceToken(DeviceToken deviceToken);

    DeviceToken getDeviceToken(String deviceId);
}
