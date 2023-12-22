package org.example.hw27;

import org.example.CarDetails;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;


public class CarDetailsListController {

    public static void printAllCars(Map<Integer, CarDetails> carMap) {
        System.out.println("All cars in carHashMap:");
        carMap.forEach((id, car) -> System.out.println(id + ": " + car));
    }
    public static void getCarInfoByModel(Map<Integer, CarDetails> carMap, String model) {
        System.out.println("Information about cars with model " + model + ":");
        carMap.entrySet().stream()
                .filter(entry -> entry.getValue().getBrand().equalsIgnoreCase(model))
                .forEach(entry -> System.out.println("Car ID: " + entry.getKey() + ", " + entry.getValue()));
    }
    // Метод 1: Отримати id авто за моделлю та роздрукувати результат
   public static void printCarIdByModel(Map<Integer, CarDetails> carMap, String model) {
        System.out.println("Searching for model: " + model);
        Optional<Integer> carId = carMap.entrySet().stream()
                .filter(entry -> entry.getValue().getBrand().equalsIgnoreCase(model))
                .map(Map.Entry::getKey)
                .findFirst();

        if (carId.isPresent()) {
            System.out.println("Car ID for model " + model + ": " + carId.get());
        } else {
            System.out.println("Model " + model + " not found.");
        }
    }

    // Метод 2: Перевірити, чи існує вказана модель автомобіля в HashMap
   public static void checkModelExists(Map<Integer, CarDetails> carMap, String model) {
        Optional<Integer> carId = carMap.entrySet().stream()
                .filter(entry -> entry.getValue().getBrand().equalsIgnoreCase(model))
                .map(Map.Entry::getKey)
                .findFirst();

        if (carId.isPresent()) {
            System.out.println("Model " + model + " exists in the HashMap. With ID: " + carId.get());
        } else {
            System.out.println("Model " + model + " does not exist in the HashMap.");
        }
    }
    // Метод 3: Надрукувати список усіх моделей автомобілів
    public static void printAllCarModels(Map<Integer, CarDetails> carMap) {
        System.out.println("List of all car models:");
        carMap.values().forEach(car -> System.out.print(car.getBrand() + ", "));
        System.out.println();
    }

    // Метод 4: Визначити та надрукувати унікальні марки автомобілів
    public static void printUniqueCarBrandsWithDuplicates(Map<Integer, CarDetails> carMap) {
        Map<String, Long> brandCountMap = carMap.values().stream()
                .map(CarDetails::getBrand)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Unique car brands with duplicate counts:");
        brandCountMap.forEach((brand, count) -> System.out.println(brand + ": " + count));
    }
    // Метод 5: Оновити відомості про автомобіль (змінити колір)
    public static void updateCarColor(Map<Integer, CarDetails> carMap, String model, String newColor) {
        carMap.values().stream()
                .filter(car -> car.getBrand().equalsIgnoreCase(model))
                .forEach(car -> car.setColor(newColor));
    }

    // Метод 6: Видалити автомобіль
    public static void deleteCar(Map<Integer, CarDetails> carMap, String model) {
        carMap.entrySet().removeIf(entry -> entry.getValue().getBrand().equalsIgnoreCase(model));
    }
    // Метод 7: Відсортувати автомобілі за роком випуску та роздрукувати хеш-карту
    public static void sortCarsByYear(Map<Integer, CarDetails> carMap) {
        System.out.println("Sorted cars by year:");
        Map<Integer, CarDetails> sortedCarMap = carMap.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> entry.getValue().getYear()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        sortedCarMap.forEach((id, car) -> System.out.println(id + ": " + car));
    }

    // Метод 8: Фільтрувати автомобілі за маркою
    public static Map<Integer, CarDetails> filterCarsByBrand(Map<Integer, CarDetails> carMap, String brand) {
        return carMap.entrySet().stream()
                .filter(entry -> entry.getValue().getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));
    }
}
