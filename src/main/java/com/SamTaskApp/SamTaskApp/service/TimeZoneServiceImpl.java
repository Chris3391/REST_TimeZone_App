package com.SamTaskApp.SamTaskApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class TimeZoneServiceImpl implements TimeZoneService{

    private final RestTemplate restTemplate;

    @Autowired
    public TimeZoneServiceImpl (RestTemplate restTemplate)  {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getTimeZone(String theCity) {
        String url = "https://timezoneapi.io/api/timezone/?Europe/" + theCity
                + "&token=" + "kBumIPhLqMKa";

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("city", theCity);

        try {
        String theTimeZone = restTemplate.getForObject
                (builder.toUriString(), String.class);
        return theTimeZone; }
        catch (Exception e) {
            return "The City was not found " + theCity ;}

    }
}
