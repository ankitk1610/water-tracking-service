package com.idp.watertracker.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum WaterIntakeUnit {

    SMALL_GLASS("SMALL_GLASS", "200-250 ml"),
    MEDIUM_GLASS("MEDIUM_GLASS", "300-350 ml"),
    LARGE_GLASS("LARGE_GLASS", "approx 500 ml"),
    CUP("CUP", "50-200 ml"),
    ML("ML", "quantity in ml");


    private String value;
    private String description;

    public String getValue() {
        return  value;
    }

    public String getDescription() {
        return  description;
    }

    WaterIntakeUnit(String value, String description) {
        this.value = value;
        this.description = description;

    }

    @JsonCreator
    public static WaterIntakeUnit fromValue(String value) {
        for (WaterIntakeUnit unit : WaterIntakeUnit.values()) {
            if (unit.value.equalsIgnoreCase(value)) {
                return unit;
            }
        }
        throw new IllegalArgumentException("Invalid water intake unit: " + value);
    }
}
