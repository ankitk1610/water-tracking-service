package com.idp.watertracker.service.impl;

import com.idp.watertracker.model.WaterIntake;
import com.idp.watertracker.repository.WaterIntakeRepository;
import com.idp.watertracker.service.WaterTrackerService;
import com.idp.watertracker.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterTrackerServiceImpl implements WaterTrackerService {


    @Autowired
    WaterIntakeRepository waterIntakeRepository;

    @Override
    public List<WaterIntake> getWaterIntakeByUsername(String username) {

        return waterIntakeRepository.findByUsername(username);
    }

    @Override
    public WaterIntake saveWaterIntake(WaterIntake waterIntake) {
        return waterIntakeRepository.save(waterIntake);

    }
}
