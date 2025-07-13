package com.example.helloWorldApplication.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloWorldApplication.exception.CountryNotFoundException;
import com.example.helloWorldApplication.model.Country;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/country")
public class CountryController {

    private static final Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India"));
        countryMap.put("US", new Country("US", "United States"));
        countryMap.put("JP", new Country("JP", "Japan"));
    }

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable("code") String code) {
        Country country = countryMap.get(code.toUpperCase());
        if (country == null) {
            throw new CountryNotFoundException("Country not found: " + code);
        }
        return country;
    }
    @PostConstruct
public void init() {
    System.out.println("✅ CountryController initialized");
}
}