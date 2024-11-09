package com.idp.watertracker.watertrackerservice.repository;


import com.idp.watertracker.watertrackerservice.model.WaterIntake;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaterIntakeRepository extends MongoRepository<WaterIntake, String> {

    List<WaterIntake> findByUsernameOrderByUpdatedAtDesc(String username);
}
