package com.idp.watertracker.contoller;


import com.idp.watertracker.model.WaterIntake;
import com.idp.watertracker.model.WaterIntakeUnitResponse;
import com.idp.watertracker.model.enums.WaterIntakeUnit;
import com.idp.watertracker.service.WaterTrackerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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
    public ResponseEntity<?> saveWaterIntake(@Valid @RequestBody WaterIntake waterIntake) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                waterTrackerService.saveWaterIntake(waterIntake)
        );
    }

    @PutMapping()
    public ResponseEntity<?> saveWaterIntake(@RequestParam("id") String id, @Valid @RequestBody WaterIntake waterIntake) {
        return ResponseEntity.status(HttpStatus.OK).body(
                waterTrackerService.updateWaterIntake(id, waterIntake)
        );
    }

    @GetMapping()
    public ResponseEntity<?> getUsersWaterIntake(@RequestParam(name = "username") String username) {
        return ResponseEntity.status(HttpStatus.OK).body(
                waterTrackerService.getWaterIntakeByUsername(username));
    }

    @GetMapping("quantity")
    public ResponseEntity<?> getUsersWaterIntake() {
        return ResponseEntity.status(HttpStatus.OK).body(
                Arrays.stream(WaterIntakeUnit.values()).map(t ->
                        WaterIntakeUnitResponse.builder()
                                .unit(t.getValue())
                                .description(t.getDescription())
                                .build()
                ).toList());
    }
}
