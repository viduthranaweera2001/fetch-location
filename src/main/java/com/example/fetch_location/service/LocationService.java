package com.example.fetch_location.service;

import com.example.fetch_location.controller.response.LocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
public class LocationService {
    private final RestTemplate restTemplate;

    public LocationResponse getCurrentLocation() {
        String url = "http://ip-api.com/json/";

        LocationResponse response = restTemplate.getForObject(url, LocationResponse.class);

        if (response != null) {
            return new LocationResponse(response.getLat(), response.getLon());
        }
        System.out.println(response.getLat());

        return new LocationResponse(0.0, 0.0);
    }
}
