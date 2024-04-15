package com.project.weatherapp.controller;

import com.project.weatherapp.DTO.WeatherDTO;
import com.project.weatherapp.model.WeatherModel;
import com.project.weatherapp.services.GetWeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final GetWeatherService weatherService;

    public WeatherController(GetWeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public ResponseEntity<WeatherDTO> getWeatherUpdate(@PathVariable("city") String city){
        WeatherDTO response = weatherService.getWeatherDetails(city);
        return ResponseEntity.ok().body(response);
    }
}
