package com.example;

public class Country {
    private String name;
    private int countryCode;

    public Country(String name, int countryCode) {
        this.name = name;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }
}
