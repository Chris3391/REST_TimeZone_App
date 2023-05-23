package com.SamTaskApp.SamTaskApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.SamTaskApp.SamTaskApp.entity.TimeZone;

@Service
public class TimeZoneImplement implements TimeZoneService{

    private final RestTemplate restTemplate;

@Autowired
    public TimeZoneImplement (RestTemplate restTemplate)  {
        this.restTemplate = restTemplate;
    }

    @Override
    public TimeZone getTimeZone(String theCity) {
       String url = "https://timezoneapi.io/api/timezone";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("city", theCity);
       TimeZone theTimeZone = restTemplate.getForObject
               (builder.toUriString(), TimeZone.class);
        return theTimeZone;
    }
}
