package com.example.geolocationservice;

public class GeoLocation {
    private String id;
    private String dateTime;
    private  GeoCoord coord;

    public GeoLocation(String id, String dateTime, GeoCoord coord) {
        this.id = id;
        this.dateTime = dateTime;
        this.coord = coord;
    }

    public String getId() {
        return id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public GeoCoord getCoord() {
        return coord;
    }
}
