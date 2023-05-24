package com.SamTaskApp.SamTaskApp.rest;


import com.SamTaskApp.SamTaskApp.service.TimeZoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timezone") //set the endpoint
public class TimeZoneRestController {

    private TimeZoneService timeZoneService;
 //constructor injection
    public TimeZoneRestController (TimeZoneService timeZoneService) {
        this.timeZoneService=timeZoneService;
    }

    @GetMapping("/{theCity}") //get the timezone of entered city
    public String getTimeZone(@PathVariable String theCity) {
     return timeZoneService.getTimeZone(theCity); //return the timezone of entered city
    }


}
