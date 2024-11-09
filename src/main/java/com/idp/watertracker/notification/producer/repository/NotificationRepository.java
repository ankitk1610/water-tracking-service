package com.idp.watertracker.notification.producer.repository;


import com.idp.watertracker.notification.producer.model.request.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {

//    List<WaterIntake> findByUsernameOrderByUpdatedAtDesc(String username);
}
