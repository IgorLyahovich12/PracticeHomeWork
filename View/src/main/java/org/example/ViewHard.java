package org.example;

import java.util.HashMap;
import java.util.Map;

import static org.example.CarDetailsListController.filterCarsByBrand;


public class ViewHard {
    public static void main(String[] args) {
        HashMap<Integer, CarDetails> carHashMap = new HashMap<>();

        // Додавання даних про автомобілі в HashMap
        carHashMap.put(1, new CarDetails("Toyota", "Blue", 2022, 15000.0, "Sedan"));
        carHashMap.put(2, new CarDetails("Honda", "Red", 2020, 20000.0, "SUV"));
        carHashMap.put(3, new CarDetails("Ford", "Black", 2021, 18000.0, "Hatchback"));
        carHashMap.put(4, new CarDetails("Chevrolet", "White", 2019, 25000.0, "Truck"));
        carHashMap.put(5, new CarDetails("BMW", "Silver", 2023, 12000.0, "Coupe"));
        carHashMap.put(6, new CarDetails("Mercedes", "Gray", 2018, 30000.0, "Sedan"));
        carHashMap.put(7, new CarDetails("Audi", "Green", 2020, 22000.0, "Convertible"));
        carHashMap.put(8, new CarDetails("Hyundai", "Yellow", 2022, 16000.0, "SUV"));
        carHashMap.put(9, new CarDetails("Kia", "Orange", 2021, 21000.0, "Hatchback"));
        carHashMap.put(10, new CarDetails("Nissan", "Purple", 2019, 28000.0, "Truck"));
        carHashMap.put(11, new CarDetails("Mazda", "Brown", 2023, 14000.0, "Coupe"));
        carHashMap.put(12, new CarDetails("Volkswagen", "Pink", 2018, 26000.0, "Sedan"));
        carHashMap.put(13, new CarDetails("Subaru", "Cyan", 2020, 19000.0, "SUV"));
        carHashMap.put(14, new CarDetails("Tesla", "Magenta", 2022, 8000.0, "Sedan"));
        carHashMap.put(15, new CarDetails("Volvo", "Lime", 2021, 17000.0, "Wagon"));
        carHashMap.put(16, new CarDetails("Ferrari", "Red", 2023, 5000.0, "Sports Car"));
        carHashMap.put(17, new CarDetails("Lamborghini", "Yellow", 2022, 3000.0, "Convertible"));
        carHashMap.put(18, new CarDetails("Porsche", "Silver", 2020, 12000.0, "Coupe"));
        carHashMap.put(19, new CarDetails("Jaguar", "Blue", 2021, 15000.0, "Sedan"));
        carHashMap.put(20, new CarDetails("Rolls-Royce", "Black", 2019, 10000.0, "Limousine"));
        carHashMap.put(21, new CarDetails("Toyota", "Green", 2020, 18000.0, "SUV"));
        carHashMap.put(22, new CarDetails("Honda", "Black", 2023, 22000.0, "Sedan"));
        carHashMap.put(23, new CarDetails("Ford", "White", 2018, 15000.0, "Truck"));
        carHashMap.put(24, new CarDetails("Chevrolet", "Blue", 2022, 19000.0, "Hatchback"));
        carHashMap.put(25, new CarDetails("BMW", "Red", 2021, 16000.0, "Convertible"));
        carHashMap.put(26, new CarDetails("Mercedes", "Silver", 2019, 30000.0, "Coupe"));
        carHashMap.put(27, new CarDetails("Audi", "Purple", 2020, 25000.0, "SUV"));
        carHashMap.put(28, new CarDetails("Hyundai", "Orange", 2022, 12000.0, "Sedan"));
        carHashMap.put(29, new CarDetails("Kia", "Yellow", 2021, 28000.0, "Truck"));
        carHashMap.put(30, new CarDetails("Nissan", "Brown", 2019, 14000.0, "Coupe"));
        carHashMap.put(31, new CarDetails("Toyota", "Gray", 2023, 20000.0, "SUV"));
        carHashMap.put(32, new CarDetails("Honda", "Silver", 2022, 25000.0, "Sedan"));
        carHashMap.put(33, new CarDetails("Ford", "Black", 2020, 16000.0, "Truck"));
        carHashMap.put(34, new CarDetails("Chevrolet", "Red", 2021, 22000.0, "Hatchback"));
        carHashMap.put(35, new CarDetails("BMW", "Blue", 2019, 18000.0, "Convertible"));
        carHashMap.put(36, new CarDetails("Toyota", "Purple", 2022, 21000.0, "Sedan"));
        carHashMap.put(37, new CarDetails("Honda", "Orange", 2023, 18000.0, "SUV"));
        carHashMap.put(38, new CarDetails("Ford", "Black", 2020, 17000.0, "Truck"));
        carHashMap.put(39, new CarDetails("Chevrolet", "Red", 2021, 20000.0, "Hatchback"));
        carHashMap.put(40, new CarDetails("BMW", "Blue", 2019, 22000.0, "Convertible"));

        System.out.println("T:1");
        CarDetailsListController.printCarIdByModel(carHashMap, "Tesla");
        System.out.println("T:2");
        CarDetailsListController.checkModelExists(carHashMap, "Toyota");
        System.out.println("T:3");
        CarDetailsListController.printAllCarModels(carHashMap);
        System.out.println("T:4");
        CarDetailsListController.printUniqueCarBrandsWithDuplicates(carHashMap);
        System.out.println("T:5");
        System.out.println("Update");
        CarDetailsListController.updateCarColor(carHashMap, "Toyota", "Green");
        CarDetailsListController.getCarInfoByModel(carHashMap, "Toyota");
        System.out.println("T:6");
        System.out.println("Remove");
        CarDetailsListController.deleteCar(carHashMap, "Tesla");
        CarDetailsListController.printAllCars( carHashMap);
        System.out.println("T:7");
        CarDetailsListController.sortCarsByYear(carHashMap);
        System.out.println("T:8");
        String brandToFilter = "Toyota";
        Map<Integer, CarDetails> filteredCars = filterCarsByBrand(carHashMap, brandToFilter);
        System.out.println("Filtered cars for brand " + brandToFilter + ":");
        CarDetailsListController.printAllCars(filteredCars);

    }
    }

