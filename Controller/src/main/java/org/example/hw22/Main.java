package org.example.hw22;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<City> cities = new ArrayList<>(List.of(
                new City("Tokyo", "Eurasia", "Japan", 37400068, true),
                new City("New York", "North America", "USA", 18713220, false),
                new City("Shanghai", "Eurasia", "China", 27058479, false),
                new City("Beijing", "Eurasia", "China", 21516000, true),
                new City("Mumbai", "Eurasia", "India", 22389950, false),
                new City("Istanbul", "Eurasia", "Turkey", 15462421, true),
                new City("Lahore", "Eurasia", "Pakistan", 12188000, false),
                new City("Paris", "Eurasia", "France", 11017230, true),
                new City("Lima", "South America", "Peru", 9750000, true),
                new City("Bangkok", "Eurasia", "Thailand", 10000000, true),
                new City("Chicago", "North America", "USA", 9130000, false),
                new City("Nairobi", "Africa", "Kenya", 4397000, true),
                new City("Sydney", "Australia", "Australia", 5312000, false),
                new City("Rio de Janeiro", "South America", "Brazil", 6710000, false),
                new City("Cairo", "Africa", "Egypt", 19965482, true),
                new City("Toronto", "North America", "Canada", 2731571, false),
                new City("Madrid", "Eurasia", "Spain", 6640000, true),
                new City("Seoul", "Eurasia", "South Korea", 9765623, true),
                new City("Dubai", "Eurasia", "UAE", 3137000, false),
                new City("Los Angeles", "North America", "USA", 12500000, false),
                new City("Buenos Aires", "South America", "Argentina", 3054300, true),
                new City("Berlin", "Eurasia", "Germany", 3520031, true),
                new City("Manila", "Eurasia", "Philippines", 1780148, true),
                new City("Osaka", "Eurasia", "Japan", 1922264, false),
                new City("Rome", "Eurasia", "Italy", 2872800, true),
                new City("Cape Town", "Africa", "South Africa", 4336880, false),
                new City("Mexico City", "North America", "Mexico", 9209944, true),
                new City("New Delhi", "Eurasia", "India", 30290936, true),
                new City("Athens", "Eurasia", "Greece", 6640466, true),
                new City("Auckland", "Australia", "New Zealand", 1497400, false),
                new City("Kiev", "Eurasia", "Ukraine", 2807044, true),
                new City("Singapore", "Eurasia", "Singapore", 5703600, true),
                new City("Oslo", "Eurasia", "Norway", 1041377, true),
                new City("Vancouver", "North America", "Canada", 631486, false),
                new City("Munich", "Eurasia", "Germany", 1484226, false),
                new City("Melbourne", "Australia", "Australia", 5112417, false),
                new City("Copenhagen", "Eurasia", "Denmark", 794128, true),
                new City("San Francisco", "North America", "USA", 883305, false),
                new City("Stockholm", "Eurasia", "Sweden", 975904, false),
                new City("Brisbane", "Australia", "Australia", 2443177, false),
                new City("Vienna", "Eurasia", "Austria", 1897491, false),
                new City("Calgary", "North America", "Canada", 1302949, false),
                new City("Hamburg", "Eurasia", "Germany", 1845229, false),
                new City("Perth", "Australia", "Australia", 2133000, false),
                new City("Helsinki", "Eurasia", "Finland", 656229, true),
                new City("Portland", "North America", "USA", 654741, false),
                new City("Zurich", "Eurasia", "Switzerland", 402762, true),
                new City("Adelaide", "Australia", "Australia", 1345777, false),
                new City("Birmingham", "Eurasia", "United Kingdom", 1141816, false),
                new City("Salt Lake City", "North America", "USA", 200591, false),
                new City("Luxembourg City", "Eurasia", "Luxembourg", 63230, false),
                new City("Wellington", "Australia", "New Zealand", 215100, false)
        ));
        List<Movie> movies = new ArrayList<>(List.of(
                new Movie("Interstellar", 2014, "Christopher Nolan", "Sci-Fi"),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, "Peter Jackson", "Adventure"),
                new Movie("Inglourious Basterds", 2009, "Quentin Tarantino", "War"),
                new Movie("The Great Gatsby", 2013, "Baz Luhrmann", "Drama"),
                new Movie("Pulp Fiction", 1994, "Quentin Tarantino", "Crime"),
                new Movie("The Silence of the Lambs", 1991, "Jonathan Demme", "Crime"),
                new Movie("The Departed", 2006, "Martin Scorsese", "Crime"),
                new Movie("Fight Club", 1999, "David Fincher", "Drama"),
                new Movie("The Shawshank Redemption", 1994, "Frank Darabont", "Drama"), // Duplicate for illustration
                new Movie("The Dark Knight Rises", 2012, "Christopher Nolan", "Action"),
                new Movie("The Wolf of Wall Street", 2013, "Martin Scorsese", "Biography"),
                new Movie("Forrest Gump", 1994, "Robert Zemeckis", "Drama"), // Duplicate for illustration
                new Movie("The Green Mile", 1999, "Frank Darabont", "Crime"),
                new Movie("The Godfather: Part II", 1974, "Francis Ford Coppola", "Crime"),
                new Movie("The Matrix Reloaded", 2003, "Lana Wachowski, Lilly Wachowski", "Sci-Fi"),
                new Movie("The Matrix Revolutions", 2003, "Lana Wachowski, Lilly Wachowski", "Sci-Fi"),
                new Movie("Forrest Gump", 1994, "Robert Zemeckis", "Drama"), // Duplicate for illustration
                new Movie("Schindler's List", 1993, "Steven Spielberg", "Biography"),
                new Movie("Star Wars: Episode V - The Empire Strikes Back", 1980, "Irvin Kershner", "Sci-Fi"),
                new Movie("The Dark Knight", 2008, "Christopher Nolan", "Action"), // Duplicate for illustration
                new Movie("Inception", 2010, "Christopher Nolan", "Sci-Fi"), // Duplicate for illustration
                new Movie("Django Unchained", 2012, "Quentin Tarantino", "Western"),
                new Movie("The Revenant", 2015, "Alejandro G. Iñárritu", "Adventure"),
                new Movie("La La Land", 2016, "Damien Chazelle", "Musical"),
                new Movie("The Shawshank Redemption", 1994, "Frank Darabont", "Drama"), // Duplicate for illustration
                new Movie("The Prestige", 2006, "Christopher Nolan", "Drama"),
                new Movie("Whiplash", 2014, "Damien Chazelle", "Drama"),
                new Movie("The Grand Budapest Hotel", 2014, "Wes Anderson", "Comedy"),
                new Movie("The Martian", 2015, "Ridley Scott", "Adventure"),
                new Movie("Gone Girl", 2014, "David Fincher", "Drama"),
                new Movie("The Social Network", 2010, "David Fincher", "Biography"),
                new Movie("The Godfather", 1972, "Francis Ford Coppola", "Crime"), // Duplicate for illustration
                new Movie("Mad Max: Fury Road", 2015, "George Miller", "Action"),
                new Movie("The Shape of Water", 2017, "Guillermo del Toro", "Adventure"),
                new Movie("Blade Runner 2049", 2017, "Denis Villeneuve", "Sci-Fi"),
                new Movie("Black Swan", 2010, "Darren Aronofsky", "Drama"),
                new Movie("Forrest Gump", 1994, "Robert Zemeckis", "Drama") // Duplicate for illustration
        ));
        List<HumanPopulation> populations = new ArrayList<>(List.of(
                new HumanPopulation("Japan", 126050000, 35, 377975, 3779750, 5500000.0, "Eurasia"),
                new HumanPopulation("United States", 331002651, 267, 9833517, 98335170, 21433225.0, "North America"),
                new HumanPopulation("China", 1444216107, 345, 9596960, 95969600, 14150480.0, "Eurasia"),
                new HumanPopulation("India", 1393409038, 379, 3287263, 32872630, 2875148.0, "Eurasia"),
                new HumanPopulation("Brazil", 212559417, 67, 8515767, 85157670, 1839755.0, "South America"),
                new HumanPopulation("South Africa", 60000000, 54, 1221037, 12210370, 352120.0, "Africa"),
                new HumanPopulation("Niger", 59308690, 38, 1267000, 12670000, 5777.0, "Africa"),
                new HumanPopulation("Australia", 25499884, 20, 7692024, 76920240, 1424283.0, "Australia"),
                new HumanPopulation("Canada", 37742154, 26, 9976140, 99761400, 1779196.0, "North America"),
                new HumanPopulation("Ukraine", 41706000, 25, 603500, 6035000, 477989.0, "Eurasia"),
                new HumanPopulation("Germany", 83149300, 234, 357022, 3570220, 4270525.0, "Eurasia"),
                new HumanPopulation("France", 65273511, 119, 551695, 5516950, 2935519.0, "Eurasia"),
                new HumanPopulation("Italy", 60461826, 205, 301340, 3013400, 2002846.0, "Eurasia"),
                new HumanPopulation("Spain", 46754778, 94, 505370, 5053700, 1318544.0, "Eurasia"),
                new HumanPopulation("Mexico", 128932753, 66, 1964375, 19643750, 1250883.0, "North America"),
                new HumanPopulation("Argentina", 45195777, 17, 2780400, 27804000, 385358.0, "South America"),
                new HumanPopulation("Egypt", 104258327, 101, 995450, 9954500, 303000.0, "Africa"),
                new HumanPopulation("Nigeria", 206139589, 226, 923768, 9237680, 448120.0, "Africa"),
                new HumanPopulation("Russia", 145912025, 9, 17098242, 170982420, 1683527.0, "Eurasia"),
                new HumanPopulation("Turkey", 84339067, 108, 769630, 7696300, 794252.0, "Eurasia"),
                new HumanPopulation("South Korea", 51269183, 527, 100210, 1002100, 1787450.0, "Eurasia"),
                new HumanPopulation("Iran", 83992949, 52, 1628550, 16285500, 677045.0, "Eurasia"),
                new HumanPopulation("Saudi Arabia", 34813871, 16, 2149690, 21496900, 793997.0, "Eurasia"),
                new HumanPopulation("South Africa", 60000000, 54, 1221037, 12210370, 351432.0, "Africa"),
                new HumanPopulation("Kenya", 53771296, 94, 580367, 5803670, 950567.0, "Africa"),
                new HumanPopulation("Japan", 126050000, 35, 377975, 3779750, 5464710.0, "Eurasia"),
                new HumanPopulation("Indonesia", 273523615, 151, 1904569, 19045690, 1188560.0, "Eurasia"),
                new HumanPopulation("Australia", 25499884, 20, 7692024, 76920240, 1431265.0, "Australia"),
                new HumanPopulation("Canada", 37742154, 26, 9976140, 99761400, 1803640.0, "North America")
        ));
        System.out.println("1 task");

        List<City> mostPopulatedCities = cities.stream()//Починаємо зі створення потоку із списку міст.
                .collect(Collectors.toMap(City::getContinent, Function.identity(),
                        (City c1, City c2) -> c1.getPopulation() > c2.getPopulation() ? c1 : c2))
                .values()
                .stream()
                .toList();
        // Вивід результату
        mostPopulatedCities.forEach(city -> System.out.println("Continent: " + city.getContinent() + ", Most Populated City: " + city.getName() + ", Population: " + city.getPopulation()));
        System.out.println("2 task");

        List<Movie> quantityMovieByDirector = movies.stream()
                .collect(Collectors.groupingBy(Movie::getDirector, Collectors.counting()))//Групуємо фільми за режисерами та підраховуємо кількість фільмів для кожного режисера.
                .entrySet()//Групуємо фільми за режисерами та підраховуємо кількість фільмів для кожного режисера.
                .stream()
                .map(entry -> new Movie(entry.getKey(), entry.getValue().intValue()))
                .toList();

        // Виведення результату
        quantityMovieByDirector.forEach(movie -> System.out.println("Director: " + movie.getDirector() + ", Movie Count: " + movie.getReleaseYear()));
        System.out.println("3 task");

        Map<String, Long> genreCountByDirector = movies.stream()
                .collect(Collectors.groupingBy(Movie::getDirector,
                        Collectors.mapping(Movie::getGenre, Collectors.toSet())))//за допомогою mapping отримуємо для кожного режисера множину унікальних жанрів
                .entrySet()//Отримуємо набір записів (ключ-значення) з мапи, де ключ - режисер, а значення - множина унікальних жанрів.
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> (long) entry.getValue().size()));

        // Виведення результату
        genreCountByDirector.forEach((director, genreCount) ->
                System.out.println("Director: " + director + ", Genre Count: " + genreCount));

        System.out.println("4 task");

        Optional<City> mostPopulatedCapital = cities.stream()
                .filter(City::isCapital) // відфільтровуємо лише столиці
                .max(Comparator.comparingInt(City::getPopulation)); // знаходимо максимальну густоту населення

        mostPopulatedCapital.ifPresent(city ->
                System.out.println("Most Populated Capital: " + city.getName() +
                        ", Population: " + city.getPopulation()));
        System.out.println("5 task");

        Map<String, Optional<City>> mostPopulatedCapitalsByContinent = cities.stream()
                .filter(City::isCapital) // відфільтровуємо лише столиці
                .collect(Collectors.groupingBy(City::getContinent,
                        Collectors.maxBy(Comparator.comparingInt(City::getPopulation))));

        mostPopulatedCapitalsByContinent.forEach((continent, city) -> city.ifPresent(c ->
                System.out.println("Continent: " + continent +
                        ", Most Populated Capital: " + c.getName() +
                        ", Population: " + c.getPopulation())));

        System.out.println("6 task");
        populations = populations.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getCityCount(), p1.getCityCount()))
                .collect(Collectors.toList());

        populations.forEach(System.out::println);

        System.out.println("7 task");
        List<Movie> filteredMovies = movies.stream()
                .filter(movie -> "Drama".equals(movie.getGenre()) || "Comedy".equals(movie.getGenre()))
                .toList();

        // Виводимо результат
        filteredMovies.forEach(System.out::println);
        System.out.println("8 task");

        Map<Integer, List<Movie>> moviesByYear = movies.stream()
                .collect(Collectors.groupingBy(Movie::getReleaseYear));

        // Вивести результат
        moviesByYear.forEach((year, movieList) -> {
            System.out.println("Рік " + year + ":");
            movieList.forEach(movie -> System.out.println("  - " + movie.getTitle()));
        });
        System.out.println("9 task");
        // Відсортувати країни за густотою населення в порядку спадання, ігноруючи країни з нульовим населенням
        List<String> sortedPopulations = populations.stream()
                .filter(population -> population.getPopulation() > 0)
                .sorted(Comparator.comparingDouble(HumanPopulation::calculatePopulationDensity).reversed())
                .map(population -> population.getCountry() + " - " + population.calculatePopulationDensity())
                .toList();

        // Вивести відсортовані дані
        sortedPopulations.forEach(System.out::println);
        System.out.println("10 task");
        Map<String, HumanPopulation> richestCountriesByContinent = populations.stream()
                .collect(Collectors.groupingBy(HumanPopulation::getContinent,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(HumanPopulation::getGdp)),
                                Optional::orElseThrow
                        )
                ));
// Вивід результатів
        richestCountriesByContinent.forEach((continent, country) ->
                System.out.println("Continent: " + continent + ", Richest Country: " + country.getCountry() + ", GDP: " + country.getGdp()));
        System.out.println("11 task");
        // Мінімальна чисельність населення
        int minPopulation = populations.stream()
                .mapToInt(HumanPopulation::getPopulation)
                .min()
                .orElse(0);

        // Максимальна чисельність населення
        int maxPopulation = populations.stream()
                .mapToInt(HumanPopulation::getPopulation)
                .max()
                .orElse(0);

        // Середня чисельність населення
        double avgPopulation = populations.stream()
                .mapToInt(HumanPopulation::getPopulation)
                .average()
                .orElse(0.0);

        System.out.println("Мінімальна чисельність населення: " + minPopulation);
        System.out.println("Максимальна чисельність населення: " + maxPopulation);
        System.out.println("Середня чисельність населення: " + avgPopulation);
        System.out.println("12 task");
        // Мінімальна чисельність населення
        populations.stream()
                .collect(Collectors.groupingBy(HumanPopulation::getContinent))
                .forEach((continent, continentPopulations) -> {
                    int minPopulationContinent = continentPopulations.stream().mapToInt(HumanPopulation::getPopulation).min().orElse(0);
                    int maxPopulationContinent = continentPopulations.stream().mapToInt(HumanPopulation::getPopulation).max().orElse(0);
                    OptionalDouble avgPopulationContinent = continentPopulations.stream().mapToInt(HumanPopulation::getPopulation).average();

                    System.out.println("Континент: " + continent);
                    System.out.println("Мінімальна кількість населення: " + minPopulationContinent);
                    System.out.println("Максимальна кількість населення: " + maxPopulationContinent);
                    System.out.println("Середня кількість населення: " + (avgPopulationContinent.isPresent() ? avgPopulationContinent.getAsDouble() : 0.0));
                    System.out.println();
                });
        System.out.println("13 task");
        HumanPopulation minPopulationCountry = populations.stream()
                .min(Comparator.comparingInt(HumanPopulation::getPopulation))
                .orElse(null);

        System.out.println("Країна з мінімальною кількістю населення: " + minPopulationCountry);

        HumanPopulation maxPopulationCountry = populations.stream()
                .max(Comparator.comparingInt(HumanPopulation::getPopulation))
                .orElse(null);

        System.out.println("Країна з максимальною кількістю населення: " + maxPopulationCountry);
        System.out.println("14 task");
        Map<String, Optional<HumanPopulation>> minPopulationsByContinent = populations.stream()
                .collect(Collectors.groupingBy(HumanPopulation::getContinent,
                        Collectors.minBy(Comparator.comparingLong(HumanPopulation::getPopulation))));//minBy: Знаходить об'єкт з мінімальним значенням населення в кожній групі.

        Map<String, Optional<HumanPopulation>> maxPopulationsByContinent = populations.stream()
                .collect(Collectors.groupingBy(HumanPopulation::getContinent,
                        Collectors.maxBy(Comparator.comparingLong(HumanPopulation::getPopulation))));//maxBy: Знаходить об'єкт з максимальним значенням населення в кожній групі.

        System.out.println("Країни з мінімальною кількістю населення за континентами:");
        minPopulationsByContinent.forEach((continent, population) ->
                System.out.println(continent + ": " + population.map(HumanPopulation::getCountry).orElse("Немає даних")));

        System.out.println("\nКраїни з максимальною кількістю населення за континентами:");
        maxPopulationsByContinent.forEach((continent, population) ->
                System.out.println(continent + ": " + population.map(HumanPopulation::getCountry).orElse("Немає даних")));


        System.out.println("15 task");
        Map<String, List<HumanPopulation>> populationsByContinentSortedByCities = populations.stream()
                .collect(Collectors.groupingBy(HumanPopulation::getContinent,
                        Collectors.toList()))
                .entrySet().stream()//entrySet().stream(): Перетворює відображення на потік пар ключ-значення (континент-список країн).
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .sorted(Comparator.comparingInt(HumanPopulation::getCityCount).reversed())
                                .collect(Collectors.toList())));

        // Вивести результати
        populationsByContinentSortedByCities.forEach((continent, countries) -> {
            System.out.println("Континент: " + continent);
            countries.forEach(country -> System.out.println("   " + country.getCountry() + ": " + country.getCityCount() + " міст"));
            System.out.println();
        });
        System.out.println("16 task");
        Map<String, Optional<City>> minPopulationByCountry = cities.stream()
                .collect(Collectors.groupingBy(City::getCountry,
                        Collectors.minBy(Comparator.comparingInt(City::getPopulation))));

        Map<String, Optional<City>> maxPopulationByCountry = cities.stream()
                .collect(Collectors.groupingBy(City::getCountry,
                        Collectors.maxBy(Comparator.comparingInt(City::getPopulation))));

        System.out.println("Міста з мінімальною кількістю населення в країнах:");
        minPopulationByCountry.forEach((country, city) ->
                System.out.println(country + ": " + city.map(City::getName).orElse("Немає даних")));

        System.out.println("\nМіста з максимальною кількістю населення в країнах:");
        maxPopulationByCountry.forEach((country, city) ->
                System.out.println(country + ": " + city.map(City::getName).orElse("Немає даних")));
        System.out.println("17 task");

        List<Double> gdps = populations.stream()
                .map(HumanPopulation::getGdp)
                .toList();

// Знайти мінімальне, максимальне, середнє та стандартне відхилення
        Optional<Double> minGdp = gdps.stream().min(Double::compareTo);
        double maxGdp = gdps.stream().max(Double::compareTo).orElse(0.0);
        double averageGdp = gdps.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        double sumOfSquares = gdps.stream().mapToDouble(gdp -> Math.pow(gdp - averageGdp, 2)).sum();
        double standardDeviation = Math.sqrt(sumOfSquares / gdps.size());

// Вивести результати з не більше двома знаками після коми
        System.out.printf("Мінімальне ВНП: %.2f\n", minGdp.orElse(0.0));
        System.out.printf("Максимальне ВНП: %.2f\n", maxGdp);
        System.out.printf("Середнє ВНП: %.2f\n", averageGdp);
        System.out.printf("Стандартне відхилення ВНП: %.2f\n", standardDeviation);
        System.out.println("18 task");
        Map<Integer, Long> moviesByReleaseYear = movies.stream()
                .collect(Collectors.groupingBy(Movie::getReleaseYear, Collectors.counting()));

        Map.Entry<Integer, Long> yearWithMaxMoviesEntry = moviesByReleaseYear.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new IllegalStateException("No movies found"));

        int yearWithMaxMovies = yearWithMaxMoviesEntry.getKey();
        long maxMoviesCount = yearWithMaxMoviesEntry.getValue();

        System.out.println("Year with the maximum number of movies: " + yearWithMaxMovies);
        System.out.println("Number of movies in that year: " + maxMoviesCount);

        System.out.println("19 task");
        int arraySize = 100; // Change the array size as needed
        int[] array = generateRandomArray(arraySize);
        SearchBenchmark.runBenchmark(array,10);
        SortingBenchmark.runBenchmark(array);
        System.out.println("20 task");
        List<Movie> sortedMoviesByYear = movies.stream()
                .sorted(Comparator.comparingInt(Movie::getReleaseYear))
                .toList();

        sortedMoviesByYear.forEach(System.out::println);
        int targetYear = 2010;
        Optional<Movie> foundMovie = movies.stream()
                .filter(movie -> movie.getReleaseYear() == targetYear)
                .findFirst();
        System.out.println();
        foundMovie.ifPresent(movie -> System.out.println("Movie found: " + movie));
    }
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000000) + 1;
        }
        return array;
    }
    }














