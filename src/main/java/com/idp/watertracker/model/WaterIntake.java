package com.idp.watertracker.model;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.idp.watertracker.model.enums.WaterIntakeUnit;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class WaterIntake {

    @Id
    private String id;

    @NotBlank
    private  String username;

    private WaterIntakeUnit unit;

    private  int quantity;

    @Timestamp
    private long createdAt = System.currentTimeMillis();
}
