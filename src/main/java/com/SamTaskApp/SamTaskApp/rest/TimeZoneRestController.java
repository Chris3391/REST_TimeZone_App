package com.SamTaskApp.SamTaskApp.rest;


import com.SamTaskApp.SamTaskApp.dto.TimeZoneDTO;
import com.SamTaskApp.SamTaskApp.service.TimeZoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timezone")
public class TimeZoneRestController {

    private TimeZoneService timeZoneService;

    public TimeZoneRestController(TimeZoneService timeZoneService) {
        this.timeZoneService = timeZoneService;
    }

    @GetMapping("/{theCity}")
    public TimeZoneDTO getTimeZone(@PathVariable String theCity) {
        return timeZoneService.getTimeZone(theCity);
    }

}
