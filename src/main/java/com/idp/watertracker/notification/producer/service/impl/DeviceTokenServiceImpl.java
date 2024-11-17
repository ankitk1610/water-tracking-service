package com.idp.watertracker.notification.producer.service.impl;

import com.idp.watertracker.notification.producer.DeviceTokenRepository;
import com.idp.watertracker.notification.producer.model.DeviceToken;
import com.idp.watertracker.notification.producer.service.DeviceTokenService;
import com.idp.watertracker.watertrackerservice.exception.DeviceTokenNotFoundException;
import com.idp.watertracker.watertrackerservice.exception.IntakeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceTokenServiceImpl implements DeviceTokenService {

    @Autowired
    private DeviceTokenRepository deviceTokenRepository;

    @Override
    public DeviceToken saveDeviceToken(DeviceToken deviceToken) {
        return deviceTokenRepository.save(deviceToken);
    }

    @Override
    public DeviceToken getDeviceToken(String deviceId) {

        return deviceTokenRepository.findByDeviceId(deviceId).orElseThrow(
                () -> new DeviceTokenNotFoundException("Device Token Not Found"));

    }
}
