package com.prayer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prayer.model.PrayerTimesResponse;

@Service
public class PrayerTimesService {
    @Autowired
    private final RestTemplate restTemplate;

    @Value("${api.url}")
    private String apiUrl;

    public PrayerTimesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PrayerTimesResponse getPrayerTimes(String userIp) {
        try {
            // Make API request to fetch prayer times with user IP as a query parameter
            String fullApiUrl = apiUrl + "?user_ip=" + userIp;
            System.out.printf("The full API URL is: %s\n", fullApiUrl);
            return restTemplate.getForObject(fullApiUrl, PrayerTimesResponse.class);
        } catch (Exception e) {
            // Handle exceptions, log errors, etc.
            e.printStackTrace();
            // You might want to throw a custom exception or return a default/fallback
            // response.
            return createDefaultPrayerTimesResponse();
        }
    }

    private PrayerTimesResponse createDefaultPrayerTimesResponse() {
        // Create and return a default/fallback PrayerTimesResponse
        // You can customize this based on your requirements.
        return new PrayerTimesResponse();
    }
}
