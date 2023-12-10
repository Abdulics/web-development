package com.prayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Settings {

    @JsonProperty("name")
    private String name;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("method")
    private int method;

    @JsonProperty("juristic")
    private int juristic;

    @JsonProperty("high_latitude")
    private int high_latitude;

    @JsonProperty("fajir_rule")
    private FajirRule fajir_rule;

    @JsonProperty("maghrib_rule")
    private MaghribRule maghrib_rule;

    @JsonProperty("isha_rule")
    private IshaRule isha_rule;

    @JsonProperty("time_format")
    private int time_format;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getMethod() {
        return this.method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public int getJuristic() {
        return this.juristic;
    }

    public void setJuristic(int juristic) {
        this.juristic = juristic;
    }

    public int getHigh_latitude() {
        return this.high_latitude;
    }

    public void setHigh_latitude(int high_latitude) {
        this.high_latitude = high_latitude;
    }

    public FajirRule getFajir_rule() {
        return this.fajir_rule;
    }

    public void setFajir_rule(FajirRule fajir_rule) {
        this.fajir_rule = fajir_rule;
    }

    public MaghribRule getMaghrib_rule() {
        return this.maghrib_rule;
    }

    public void setMaghrib_rule(MaghribRule maghrib_rule) {
        this.maghrib_rule = maghrib_rule;
    }

    public IshaRule getIsha_rule() {
        return this.isha_rule;
    }

    public void setIsha_rule(IshaRule isha_rule) {
        this.isha_rule = isha_rule;
    }

    public int getTime_format() {
        return this.time_format;
    }

    public void setTime_format(int time_format) {
        this.time_format = time_format;
    }

}
