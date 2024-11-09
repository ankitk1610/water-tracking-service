package com.idp.watertracker.watertrackerservice.contoller;


import com.idp.watertracker.watertrackerservice.model.WaterIntake;
import com.idp.watertracker.watertrackerservice.model.enums.WaterIntakeUnit;
import com.idp.watertracker.watertrackerservice.service.WaterTrackerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/wts/water-intake")
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

    @DeleteMapping()
    public ResponseEntity<?> deleteWaterIntakeById(@RequestParam("id") String id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                waterTrackerService.deleteWaterIntakeById(id));
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
                        t.getWaterIntakeUnitDetail(t)
                ).toList());
    }
}
