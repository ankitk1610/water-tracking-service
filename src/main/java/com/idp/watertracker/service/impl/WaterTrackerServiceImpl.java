package com.idp.watertracker.service.impl;

import com.idp.watertracker.exception.IntakeNotFoundException;
import com.idp.watertracker.model.WaterIntake;
import com.idp.watertracker.repository.WaterIntakeRepository;
import com.idp.watertracker.service.WaterTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterTrackerServiceImpl implements WaterTrackerService {


    @Autowired
    WaterIntakeRepository waterIntakeRepository;

    @Override
    public List<WaterIntake> getWaterIntakeByUsername(String username) {

        return waterIntakeRepository.findByUsernameOrderByUpdatedAtDesc(username);
    }

    @Override
    public WaterIntake saveWaterIntake(WaterIntake waterIntake) {
        return waterIntakeRepository.save(waterIntake);

    }

    @Override
    public WaterIntake updateWaterIntake(String id, WaterIntake waterIntake) {
        WaterIntake currentIntake = waterIntakeRepository.findById(id).orElseThrow(
                () -> new IntakeNotFoundException("Water Intake Entry does not exist"));

        currentIntake.setUnit(waterIntake.getUnit());
        currentIntake.setQuantity(waterIntake.getQuantity());
        currentIntake.setUpdatedAt(waterIntake.getUpdatedAt());

        return waterIntakeRepository.save(currentIntake);
    }
}
