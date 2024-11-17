//package com.idp.watertracker;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.messaging.ApnsConfig;
//import com.google.firebase.messaging.Aps;
//import com.google.firebase.messaging.FirebaseMessaging;
//import com.google.firebase.messaging.Message;
//
//import java.io.FileInputStream;
//
//import static com.idp.watertracker.notification.producer.utils.Constants.SERVICE_ACCOUNT_FILE_PATH;
//import static com.idp.watertracker.notification.producer.utils.Constants.SERVICE_ACCOUNT_FILE_PATH_TEST;
//
//public class FCMExample {
//    public static void main(String[] args) throws Exception {
//
//
//
//        // Initialize Firebase Admin SDK
//        FileInputStream serviceAccount = new FileInputStream(SERVICE_ACCOUNT_FILE_PATH_TEST);
//
//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//        FirebaseApp.initializeApp(options);
//
//        // Send a message to a specific device
//        String registrationToken = "DEVICE_FCM_TOKEN";
//
//        // Create APNs configuration
//        ApnsConfig apnsConfig = ApnsConfig.builder()
//                .setAps(Aps.builder()
//                        .setAlert("Hello iOS!")
//                        .setSound("default")
//                        .build())
//                .build();
//
//        Message message = Message.builder()
//                .putData("title", "Hello!")
//                .putData("body", "This is a test notification.")
//                .setToken(registrationToken)
//                .setApnsConfig(apnsConfig)
//                .putData("customKey", "customValue")
//                .build();
//
//        String response = FirebaseMessaging.getInstance().send(message);
//        System.out.println("Successfully sent message: " + response);
//    }
//}
