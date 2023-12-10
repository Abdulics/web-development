package com.prayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {
    @JsonProperty("Fajr")
    private String fajr;

    @JsonProperty("Duha")
    private String duha;

    @JsonProperty("Dhuhr")
    private String dhuhr;

    @JsonProperty("Asr")
    private String asr;

    @JsonProperty("Maghrib")
    private String maghrib;

    @JsonProperty("Isha")
    private String isha;


    public String getFajr() {
        return this.fajr;
    }

    public void setFajr(String fajr) {
        this.fajr = fajr;
    }

    public String getDuha() {
        return this.duha;
    }

    public void setDuha(String duha) {
        this.duha = duha;
    }

    public String getDhuhr() {
        return this.dhuhr;
    }

    public void setDhuhr(String dhuhr) {
        this.dhuhr = dhuhr;
    }

    public String getAsr() {
        return this.asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getMaghrib() {
        return this.maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsha() {
        return this.isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }

}
