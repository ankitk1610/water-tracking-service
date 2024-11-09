package com.idp.watertracker.watertrackerservice.model;

import com.idp.watertracker.watertrackerservice.model.enums.WaterIntakeUnit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WaterIntakeUnitResponse {

    private  String unit;
    private  String description;

}
