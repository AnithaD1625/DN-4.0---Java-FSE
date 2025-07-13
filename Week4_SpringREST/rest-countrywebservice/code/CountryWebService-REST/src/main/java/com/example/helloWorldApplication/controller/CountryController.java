package com.example.helloWorldApplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloWorldApplication.model.Country;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountry() {
        return new Country("IN", "India");
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return List.of(
            new Country("IN", "India"),
            new Country("US", "United States"),
            new Country("JP", "Japan")
        );
    }
}