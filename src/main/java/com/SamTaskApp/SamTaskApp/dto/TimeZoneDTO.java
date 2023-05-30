package com.SamTaskApp.SamTaskApp.dto;




public class TimeZoneDTO {
    private String timezone;

    public TimeZoneDTO() {}

    public TimeZoneDTO(String timezone) {
        this.timezone = timezone;}

    public String getTimezone() {
        return timezone;}

    @Override
    public String toString() {
        return "TimeZoneDTO{" +
                "timezone='" + timezone + '\'' +
                '}';
    }
}
