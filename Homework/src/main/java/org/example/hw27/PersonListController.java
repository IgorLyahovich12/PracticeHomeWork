package org.example.hw27;

import org.example.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PersonListController {
    public static class KeyValue {

        private final String key;
        private final Person value;

        public KeyValue(String key, Person value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Ключ"+ key +" "+ "має таке значення " + value;
        }
    }

    // Task 1: Отримати значення, пов’язане з певним ключем
    public static void getValueForKey(HashMap<String, Person> personMap, String key) {
        personMap.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(key))
                .map(Map.Entry::getValue)
                .forEach(person -> System.out.println("Person with key '" + key + "': " + person));
    }

    // Task 2: Перевірте, чи існує ключ у HashMap
    public static void containsKeyUsingStream(HashMap<String, Person> personMap, String key) {
        boolean containsKey = personMap.entrySet()
                .stream()
                .anyMatch(entry -> entry.getKey().equals(key));
        Person Person = personMap.get(key);
        System.out.println("Contains key '" + key + "': " + containsKey + Person);

    }

    // Task 3: Роздрукувати всі ключі в HashMap
    public static void printAllKeysUsingStream(HashMap<String, Person> personMap) {
        System.out.println("All keys in HashMap:");
        personMap.keySet().forEach(System.out::println);
    }

    // Task 4: Роздрукуйте всі значення в HashMap
    public static void printAllValuesUsingStream(HashMap<String, Person> personMap) {
        System.out.println("All values in HashMap:");
        personMap.values().forEach(System.out::println);
    }

    // Task 5: Роздрукувати всі записи в HashMap
    public static void printAllEntriesUsingStream(HashMap<String, Person> personMap) {
        System.out.println("All entries in HashMap:");
        personMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    // Task 6: Змінити значення для певного ключа
    public static void changeValueForKeyUsingStream(HashMap<String, Person> personMap, String key, String newName) {
        personMap.computeIfPresent(key, (k, value) -> {
            value.setName(newName);
            return value;
        });
        Person updatedPerson = personMap.get(key);
        System.out.println("Value for key '" + key + "' changed. Updated value: " + updatedPerson);
        System.out.println("New name in main: " + newName);
    }

    // Task 7: Видалити ключ і пов’язане значення з HashMap
    public static void removeEntryForKeyUsingStream(HashMap<String, Person> personMap, String key) {
        personMap.entrySet()
                .removeIf(entry -> entry.getKey().equals(key));
        System.out.println("Entry for key '" + key + "' removed.");
    }

    // Task 8:Роздрукуйте розмір HashMap
    public static void printHashMapSizeUsingStream(HashMap<String, Person> personMap) {
        System.out.println("Size of HashMap: " + personMap.size());
    }

    // Task 9: Очистити всі елементи з HashMap
    public static void clearHashMapUsingStream(HashMap<String, Person> personMap) {
        personMap.clear();
        System.out.println("HashMap cleared.");
    }

    // Task 10: Перевірте, чи HashMap порожній
    public static void checkIfHashMapIsEmptyUsingStream(HashMap<String, Person> personMap) {
        boolean isEmpty = personMap.isEmpty();
        System.out.println("HashMap is empty: " + isEmpty);
    }

    // Task 11: Створіть новий HashMap і скопіюйте всі елементи з існуючого HashMap
    public static <K, V> HashMap<K, V> copyHashMap(Map<K, V> originalMap) {
        return new HashMap<>(originalMap);
    }

    // Task 12:  Відсортуйте HashMap за ключами та роздрукуйте результат
    public static void sortHashMapByKeyAndPrint(HashMap<String, Person> personMap) {
        List<Map.Entry<String, Person>> sortedEntries = personMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparingInt(Integer::parseInt)))
                .toList();

        System.out.println("Sorted HashMap by keys in ascending order:");
        for (Map.Entry<String, Person> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Task 13: Відсортуйте HashMap за значеннями (віком) і роздрукуйте результат
    public static void sortHashMapByValuesAndPrint(HashMap<String, Person> personMap) {
        List<Map.Entry<String, Person>> sortedEntries = personMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Person::getAge)))
                .toList();

        System.out.println("Sorted HashMap by values (age):");
        for (Map.Entry<String, Person> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Task 14: Відфільтруйте HashMap за значеннями та видаліть записи віком менше X років
    public static void filterAndRemoveByAge(HashMap<String, Person> personMap, int thresholdAge) {
        Iterator<Map.Entry<String, Person>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Person> entry = iterator.next();
            if (entry.getValue().getAge() < thresholdAge) {
                iterator.remove();
            }
        }
        System.out.println("Filtered HashMap by age. Entries with age less than " + thresholdAge + " removed.");
    }

    // Task 15: Об’єднати дві HashMaps
    public static HashMap<String, Person> mergeHashMaps(HashMap<String, Person> map1, HashMap<String, Person> map2) {
        return Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (existing, replacement) -> replacement, HashMap::new));
    }

    // Task 16: Знайти ключ за значенням (Ім'я)
    public static String findKeyByName(HashMap<String, Person> personMap, String name) {
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Task 17: Перетворити HashMap на список пар ключ-значення
    public static List<KeyValue> convertHashMapToList(HashMap<String, Person> personMap) {
        return personMap.entrySet().stream()
                .map(entry -> new KeyValue(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
    // Task 18:Compare two HashMaps for equality
    public static boolean compareHashMaps(HashMap<String, Person> map1, HashMap<String, Person> map2) {
        return map1.entrySet().stream()
                .allMatch(entry -> map2.entrySet().stream()
                        .anyMatch(entry2 -> entry2.getKey().equals(entry.getKey()) && entry2.getValue().equals(entry.getValue())))
                && map2.entrySet().stream()
                .allMatch(entry -> map1.entrySet().stream()
                        .anyMatch(entry1 -> entry1.getKey().equals(entry.getKey()) && entry1.getValue().equals(entry.getValue())));
    }
}



