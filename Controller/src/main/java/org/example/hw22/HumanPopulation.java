package org.example.hw22;



public class HumanPopulation {
    private final String country;
    private final int population;
    private final int cityCount;
    private final int countrySize;
    private final int populationDensity;
    private final double gdp;  // Додано ВВП
    private final String continent;

    public HumanPopulation(String country, int population, int cityCount, int countrySize, int populationDensity, double gdp, String continent) {
        this.country = country;
        this.population = population;
        this.cityCount = cityCount;
        this.countrySize = countrySize;
        this.populationDensity = populationDensity;
        this.gdp = gdp;
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getCityCount() {
        return cityCount;
    }

    public double getGdp() {
        return gdp;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "HumanPopulation{" +
                "country='" + country + '\'' +
                ", population=" + population +
                ", cityCount=" + cityCount +
                ", countrySize=" + countrySize +
                ", populationDensity=" + populationDensity +
                ", gdp=" + gdp +
                ", continent='" + continent + '\'' +
                '}';
    }

    public double calculatePopulationDensity() {
        // Розрахунок густоти населення: населення / площа країни
        return (double) population / countrySize;
    }
}