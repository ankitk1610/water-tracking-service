package com.idp.watertracker.notification.producer;

import com.idp.watertracker.notification.producer.model.DeviceToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeviceTokenRepository extends MongoRepository<DeviceToken, String> {

    Optional<DeviceToken> findByDeviceId(String deviceId);
}
