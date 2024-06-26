package com.project.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Wind {
    private double speed;
    private double deg;
    private double gust;
}
