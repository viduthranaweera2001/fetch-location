package com.example.fetch_location.controller;

import com.example.fetch_location.controller.response.LocationResponse;
import com.example.fetch_location.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LocationController {
    private final LocationService locationService;

    @GetMapping("/location")
    public LocationResponse getLocation() {

        return locationService.getCurrentLocation();
    }
}
