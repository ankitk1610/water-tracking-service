package com.idp.watertracker.watertrackerservice.service;

import com.idp.watertracker.watertrackerservice.model.WaterIntake;

import java.util.List;

public interface WaterTrackerService {


    List<WaterIntake> getWaterIntakeByUsername(String username);
    WaterIntake saveWaterIntake(WaterIntake waterIntake);
    WaterIntake updateWaterIntake(String id, WaterIntake waterIntake);
    String deleteWaterIntakeById(String id);

}
