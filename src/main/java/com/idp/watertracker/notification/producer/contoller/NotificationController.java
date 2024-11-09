package com.idp.watertracker.notification.producer.contoller;


import com.idp.watertracker.notification.producer.model.request.Notification;
import com.idp.watertracker.notification.producer.service.NotificationProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {


    @Autowired
    private NotificationProducerService notificationProducerService;

    @GetMapping("/test")
    public ResponseEntity<?> testController() {
        return ResponseEntity.ok("success");
    }


    @PostMapping()
    public ResponseEntity<?> sendNotification(@RequestBody Notification notification) {
        return ResponseEntity.ok(notificationProducerService.sendNotification(notification));
    }

}
