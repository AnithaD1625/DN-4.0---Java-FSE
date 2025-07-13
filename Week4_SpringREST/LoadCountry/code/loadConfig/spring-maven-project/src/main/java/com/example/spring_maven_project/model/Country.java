package com.example.spring_maven_project.model;

public class Country {
    private String name;
    private String capital;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCapital() { return capital; }
    public void setCapital(String capital) { this.capital = capital; }

    @Override
    public String toString() {
        return "Country{name='" + name + "', capital='" + capital + "'}";
    }
}
