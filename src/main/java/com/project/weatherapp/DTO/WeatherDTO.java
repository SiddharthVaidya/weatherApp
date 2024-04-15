package com.project.weatherapp.DTO;

import com.project.weatherapp.model.Wind;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class WeatherDTO {
    private double max_temp;
    private double min_temp;
    private Wind windDetails;
    private double humidity;
    private double feels_like;
    private String overAll;
    private String description;
}
