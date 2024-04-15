package com.project.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class WeatherModel {
    private List<Weather> weather;
    private MainDto main;
    private double visibility;
    private Wind wind;
}

