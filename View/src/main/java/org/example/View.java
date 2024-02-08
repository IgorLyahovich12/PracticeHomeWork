package org.example;

import java.util.HashMap;
import java.util.List;

import static org.example.PersonListController.*;

public class View {
    public static void main(String[] args) {
        HashMap<String, Person> personMap = new HashMap<>();

        personMap.put("15", new Person(15, "Ihor", "dfgdh4@email.com", 34));
        personMap.put("18", new Person(18, "David", "dsfsdf3@email.com", 24));
        personMap.put("13", new Person(13, "Deivr", "khgfd3@email.com", 14));
        personMap.put("17", new Person(17, "Aleks", "Jj4Lgmr@email.com", 42));
        personMap.put("245", new Person(245, "Olena", "olena@email.com", 28));
        personMap.put("34", new Person(34, "Andriy", "andriy@email.com", 32));
        personMap.put("49", new Person(49, "Serhiy", "serhiy@email.com", 40));
        personMap.put("57", new Person(57, "Kateryna", "kateryna@email.com", 26));
        personMap.put("64", new Person(64, "Oleh", "oleh@email.com", 35));
        personMap.put("7", new Person(7, "Anna", "anna@email.com", 22));
        personMap.put("89", new Person(89, "Vitaliy", "vitaliy@email.com", 45));
        personMap.put("93", new Person(93, "Yevhen", "yevhen@email.com", 30));
        personMap.put("107", new Person(107, "Viktoriya", "viktoriya@email.com", 23));
        personMap.put("115", new Person(115, "Mykola", "mykola@email.com", 43));
        personMap.put("124", new Person(124, "Oksana", "oksana@email.com", 29));
        personMap.put("135", new Person(135, "Taras", "taras@email.com", 37));
        personMap.put("148", new Person(148, "Inna", "inna@email.com", 25));
        personMap.put("157", new Person(157, "Volodymyr", "volodymyr@email.com", 41));
        personMap.put("168", new Person(168, "Nataliya", "nataliya@email.com", 21));
        personMap.put("173", new Person(173, "Dmytro", "dmytro@email.com", 46));
        personMap.put("186", new Person(186, "Iryna", "iryna@email.com", 31));
        personMap.put("193", new Person(193, "Ruslan", "ruslan@email.com", 27));

        HashMap<String, Person> personMap1 = new HashMap<>();

        personMap1.put("210", new Person(210, "John", "john@email.com", 26));
        personMap1.put("215", new Person(215, "Emily", "emily@email.com", 32));
        personMap1.put("220", new Person(220, "Michael", "michael@email.com", 29));
        personMap1.put("225", new Person(225, "Sophie", "sophie@email.com", 35));
        personMap1.put("230", new Person(230, "Benjamin", "benjamin@email.com", 28));
        personMap1.put("235", new Person(235, "Eva", "eva@email.com", 31));
        personMap1.put("240", new Person(240, "Daniel", "daniel@email.com", 36));
        personMap1.put("245", new Person(245, "Olivia", "olivia@email.com", 33));
        personMap1.put("250", new Person(250, "Liam", "liam@email.com", 30));





        System.out.println("T:1");
        getValueForKey(personMap, "15");
        System.out.println("T:2");
        containsKeyUsingStream(personMap, "18");
        System.out.println("T:3");
        printAllKeysUsingStream(personMap);
        System.out.println("T:4");
        printAllValuesUsingStream(personMap);
        System.out.println("T:5");
        printAllEntriesUsingStream(personMap);
        System.out.println("T:6");
        changeValueForKeyUsingStream(personMap, "18", "NewDavid");
        System.out.println("T:7");
        removeEntryForKeyUsingStream(personMap, "18");
        System.out.println("T:8");
        printHashMapSizeUsingStream(personMap);
        System.out.println("T:11");
        HashMap<String, Person> copiedMap = copyHashMap(personMap);
        System.out.println("Copied HashMap: " + copiedMap);
        System.out.println("T:9");
        clearHashMapUsingStream(personMap);
        System.out.println("T:10");
        checkIfHashMapIsEmptyUsingStream(personMap);
        System.out.println("T:12");
        sortHashMapByKeyAndPrint(copiedMap);
        System.out.println("T:13");
        sortHashMapByValuesAndPrint(copiedMap);
        System.out.println("T:14");
        filterAndRemoveByAge(personMap, 25);
        System.out.println("Filtered HashMap after removing entries with age less than 25:");
        personMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("T:15");
        HashMap<String, Person> mergedMap = mergeHashMaps(copiedMap, personMap1);
        System.out.println("Merged HashMap:");
        mergedMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("T:16");
        String keyForName = findKeyByName(mergedMap, "David");
        if (keyForName != null) {
            System.out.println("Key for name 'David': " + keyForName);
        } else {
            System.out.println("Name 'David' not found in the map.");
        }
        System.out.println("T:17");
        List<KeyValue> keyValueList = convertHashMapToList(personMap1);
        System.out.println("HashMap converted to List of KeyValue:");
        keyValueList.forEach(System.out::println);
        System.out.println("T:18");
        boolean isEqual = compareHashMaps(personMap1, copiedMap);
        if (isEqual) {
            System.out.println("The HashMaps are equal.");
        } else {
            System.out.println("The HashMaps are not equal.");
        }
        System.out.println("T:19");
        //personMap.put(null, new Person(56666, "Mira", ",ira@email.com", 46));
        //getValueForKey(personMap, null);
        //У Java в HashMap ключі не можуть бути null.
        // Якщо спробувати додати елемент із ключем, що дорівнює null, отримаємо NullPointerException
        //Але використавши це .stream()
        //.filter(entry -> Objects.equals(entry.getKey(), key))
        //Можна її унинути
        System.out.println("T:20");
        personMap.put("15", new Person(15, "Mira", ",ira@email.com", 46));
        getValueForKey(personMap, "15");
        //. Якщо  додаєтся декілька елементів із однаковим ключем,
        // то кожен наступний елемент з таким же ключем замінює попередній
        }
        }
    







