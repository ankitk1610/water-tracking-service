package com.idp.watertracker.contoller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterTrackerController {

    @GetMapping("/test")
    public ResponseEntity<?> testController() {

        return ResponseEntity.ok("success");

    }
}
