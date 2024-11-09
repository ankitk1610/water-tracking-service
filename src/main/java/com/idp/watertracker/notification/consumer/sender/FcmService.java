package com.idp.watertracker.notification.consumer.sender;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class FcmService {

    @Autowired
    private Gson gson;

    private final String SERVER_KEY = "YOUR_FCM_SERVER_KEY";  // Replace with your FCM server key
    private final String API_URL = "https://fcm.googleapis.com/fcm/send";

    public String sendNotification(String targetToken, String title, String message) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "key=" + SERVER_KEY);

        // Build the notification payload
        Map<String, Object> body = new HashMap<>();
        body.put("to", targetToken);

        // Notification content
        Map<String, Object> notification = new HashMap<>();
        notification.put("title", title);
        notification.put("body", message);

        body.put("notification", notification);

        // iOS-specific fields
        body.put("content_available", false);
        body.put("priority", "high");

        // Custom data payload (optional)
        Map<String, Object> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        body.put("data", data);

        // Create JSON payload
        String jsonPayload = gson.toJson(body);

        HttpEntity<String> request = new HttpEntity<>(jsonPayload, headers);

        return restTemplate.postForObject(API_URL, request, String.class);
    }
}
