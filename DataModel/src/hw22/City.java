package DataModel.src.hw22;

public record City(String name, String continent, String country, int population, boolean isCapital) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String continent() {
        return continent;
    }

    @Override
    public String country() {
        return country;
    }

    @Override
    public int population() {
        return population;
    }

    @Override
    public boolean isCapital() {
        return isCapital;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                '}';
    }
}
