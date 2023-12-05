package org.example.hw22;
public class City {
    private final String name;
    private final String continent;
    private final String country;
    private final int population;
    private final boolean isCapital;

    public City(String name, String continent, String country, int population, boolean isCapital) {
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.population = population;
        this.isCapital = isCapital;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }
    public boolean isCapital() {
        return isCapital;
    }

    public String getCountry() {
        return country;
    }
}
