package com.project.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MainDto {
    private double temp;
    private double feels_like;
    private double temp_max;
    private double temp_min;
    private double pressure;
    private double humidity;
    private double sea_level;
    private double grnd_level;
}
