package com.prayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrayerTimesResponse {

    @JsonProperty("results")
    private Results results;

    @JsonProperty("settings")
    private Settings settings;

    @JsonProperty("success")
    private boolean success;

    public Results getResults() {
        return this.results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "{" +
                " results='" + getResults() + "'" +
                ", settings='" + getSettings() + "'" +
                ", success='" + isSuccess() + "'" +
                "}";
    }

}
