package com.idp.watertracker.watertrackerservice.service.impl;

import com.idp.watertracker.notification.producer.utils.Constants;
import com.idp.watertracker.watertrackerservice.exception.IntakeNotFoundException;
import com.idp.watertracker.watertrackerservice.model.WaterIntake;
import com.idp.watertracker.watertrackerservice.repository.WaterIntakeRepository;
import com.idp.watertracker.watertrackerservice.service.WaterTrackerService;
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

    @Override
    public String deleteWaterIntakeById(String id) {
        WaterIntake currentIntake = waterIntakeRepository.findById(id).orElseThrow(
                () -> new IntakeNotFoundException("Water Intake Entry does not exist"));
        waterIntakeRepository.deleteById(id);
        return Constants.SUCCESS;
    }
}
