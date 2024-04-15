package com.project.weatherapp.services;

import com.project.weatherapp.DTO.WeatherDTO;
import com.project.weatherapp.WeatherappApplication;
import com.project.weatherapp.model.WeatherModel;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@Service
public class GetWeatherService {
    private String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
    String API_KEY = "";

    public WeatherDTO getWeatherDetails(String city){
        RestTemplate restTemplate = new RestTemplate();
        //String url = BASE_URL+"?q="+city+"&appId="+API_KEY;
        UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .queryParam("q", city)
                .queryParam("appId", API_KEY);
        WeatherModel response = restTemplate.getForObject(url.toUriString(), WeatherModel.class);
        //System.out.println(restTemplate+" "+response);
        return convertToDTO(response);
    }
    private WeatherDTO convertToDTO(WeatherModel body){
        WeatherDTO parsedResponse = new WeatherDTO();
        parsedResponse.setMax_temp(body.getMain().getTemp_max());
        parsedResponse.setMin_temp(body.getMain().getTemp_min());
        parsedResponse.setWindDetails(body.getWind());
        parsedResponse.setHumidity(body.getMain().getHumidity());
        parsedResponse.setFeels_like(body.getMain().getFeels_like());
        parsedResponse.setOverAll(body.getWeather().get(0).getMain());
        parsedResponse.setDescription(body.getWeather().get(0).getDescription());
        return parsedResponse;
    }
}
