package com.idp.watertracker.contoller;


import com.idp.watertracker.model.WaterIntake;
import com.idp.watertracker.service.WaterTrackerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("water-intake")
@Validated
public class WaterTrackerController {


    @Autowired
    private WaterTrackerService waterTrackerService;

    @GetMapping("/test")
    public ResponseEntity<?> testController() {
        return ResponseEntity.ok("success");
    }


    @PostMapping("/test")
    public ResponseEntity<?> testControllerPost() {
        return ResponseEntity.ok("success");
    }


    @PostMapping()
    public ResponseEntity<?> saveWaterIntake(@Valid  @RequestBody WaterIntake waterIntake) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                waterTrackerService.saveWaterIntake(waterIntake)
        );
    }

    @GetMapping()
    public ResponseEntity<?> getUsersWaterIntake(@RequestParam(name = "username") String username) {
        return ResponseEntity.status(HttpStatus.OK).body(
                waterTrackerService.getWaterIntakeByUsername(username));
    }
}
