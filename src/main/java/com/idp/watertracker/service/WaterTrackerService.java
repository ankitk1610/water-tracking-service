package com.idp.watertracker.service;

import com.idp.watertracker.model.WaterIntake;

import java.util.List;

public interface WaterTrackerService {


    List<WaterIntake> getWaterIntakeByUsername(String username);
    WaterIntake saveWaterIntake(WaterIntake waterIntake);
    WaterIntake updateWaterIntake(String id, WaterIntake waterIntake);

}
