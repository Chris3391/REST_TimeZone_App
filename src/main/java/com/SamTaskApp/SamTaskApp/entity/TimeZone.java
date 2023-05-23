package com.SamTaskApp.SamTaskApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TimeZone {

    @Id
    String timeZone;

    public TimeZone() {
    }

    public TimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "TimeZone{" +
                "timeZone='" + timeZone + '\'' +
                '}';
    }
}
