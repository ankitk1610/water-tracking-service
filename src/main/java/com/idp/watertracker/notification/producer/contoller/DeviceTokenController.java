package com.idp.watertracker.notification.producer.contoller;

import com.idp.watertracker.notification.producer.model.DeviceToken;
import com.idp.watertracker.notification.producer.service.DeviceTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/device-token")
public class DeviceTokenController {


    @Autowired
    private DeviceTokenService deviceTokenService;

    @PostMapping
    public ResponseEntity<?> saveDeviceToken(@RequestBody DeviceToken deviceToken) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(deviceTokenService.saveDeviceToken(deviceToken));
    }

    @GetMapping
    public ResponseEntity<?> getDeviceTokenByDeviceId(@RequestParam("device-id") String deviceId) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(deviceTokenService.getDeviceToken(deviceId));
    }
}


