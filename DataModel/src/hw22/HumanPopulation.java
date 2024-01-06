package DataModel.src.hw22;

public  record HumanPopulation(String country, int population, int cityCount, int countrySize, int populationDensity, double gdp, String continent) {
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