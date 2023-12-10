package com.prayer.controller;

import com.prayer.model.PrayerTimesResponse;
import com.prayer.service.PrayerTimesService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrayerTimesController {

    @Autowired
    private PrayerTimesService prayerTimesService;

    @GetMapping("/prayer-times")
    public String getPrayerTimes(Model model, HttpServletRequest request) {
        // Get the client's IP address from the request
        String ipAddress = "155.12.0.242";// getClientIP(request);

        // Fetch prayer times and settings using the IP address
        PrayerTimesResponse prayerTimesResponse = prayerTimesService.getPrayerTimes(ipAddress);
        System.out.println(prayerTimesResponse.toString());
        // Add prayer times and settings to the model
        model.addAttribute("results", prayerTimesResponse.getResults());
        model.addAttribute("settings", prayerTimesResponse.getSettings());

        // Return the Thymeleaf template name
        return "prayer-times-l";
    }

    // Utility method to get client's IP address from the request
    private String getClientIP(HttpServletRequest request) {
        String ipAddress = request.getHeader("X-Forwarded-For");
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_X_FORWARDED");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_X_CLUSTER_CLIENT_IP");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_FORWARDED_FOR");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_FORWARDED");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("HTTP_VIA");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("REMOTE_ADDR");
        }
        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
        }

        // If multiple IPs, the first one in the list is the client's IP
        if (ipAddress != null && ipAddress.contains(",")) {
            ipAddress = ipAddress.split(",")[0].trim();
        }

        return ipAddress;
    }

}

// @RestController
// @RequestMapping("/prayer-times")
// public class PrayerTimesController {

// private final PrayerTimesService prayerTimesService;

// @Autowired
// public PrayerTimesController(PrayerTimesService prayerTimesService) {
// this.prayerTimesService = prayerTimesService;
// }

// @GetMapping
// public PrayerTimesResponse getPrayerTimes(@RequestParam("user_ip") String
// userIp) {
// return prayerTimesService.getPrayerTimes(userIp);
// }
// }
