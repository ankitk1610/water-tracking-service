package com.idp.watertracker.repository;


import com.idp.watertracker.model.WaterIntake;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaterIntakeRepository extends MongoRepository<WaterIntake, String> {

    List<WaterIntake> findByUsernameOrderByUpdatedAtDesc(String username);
}
