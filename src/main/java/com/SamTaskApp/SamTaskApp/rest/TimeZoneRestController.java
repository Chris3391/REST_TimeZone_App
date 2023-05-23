package com.SamTaskApp.SamTaskApp.rest;


import com.SamTaskApp.SamTaskApp.entity.TimeZone;
import com.SamTaskApp.SamTaskApp.service.TimeZoneService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/timezone")
public class TimeZoneRestController {

    private TimeZoneService timeZoneService;

    public TimeZoneRestController (TimeZoneService timeZoneService) {
        this.timeZoneService=timeZoneService;
    }

    @GetMapping("/timezone/{theCity}")
    public TimeZone getTimeZone(@PathVariable String theCity) {

        if (timeZoneService == null) {
            throw new RuntimeException("Required city not found " + theCity);}

     return timeZoneService.getTimeZone(theCity);
    }


}
