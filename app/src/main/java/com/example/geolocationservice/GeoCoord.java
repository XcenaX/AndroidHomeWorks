package com.example.geolocationservice;

public class GeoCoord {
    private double latitude;
    private double longitude;

    public GeoCoord(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
