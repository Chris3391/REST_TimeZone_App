package com.SamTaskApp.SamTaskApp.service;

import com.SamTaskApp.SamTaskApp.dto.TimeZoneDTO;

public interface TimeZoneService {
    TimeZoneDTO getTimeZone(String theCity);
}
