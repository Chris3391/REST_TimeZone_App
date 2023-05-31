package com.SamTaskApp.SamTaskApp.service;

import com.SamTaskApp.SamTaskApp.dto.TimeZoneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TimeZoneServiceImpl implements TimeZoneService {

    private final RestTemplate restTemplate;

    @Value("${timezone.token}")
    private String token;
    @Value("${timezone.url}")
    private String url;

    public TimeZoneServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public TimeZoneDTO getTimeZone(String theCity) {

        String requestUrl = url + theCity + "&token=" + token;

        Optional<TimeZoneDTO> timeZone = Optional.ofNullable(restTemplate.getForObject
                (requestUrl, TimeZoneDTO.class));

        return timeZone.orElseThrow(() ->
                new NoSuchElementException("City " + theCity + " was not found"));
    }

}
