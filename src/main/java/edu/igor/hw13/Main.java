package edu.igor.hw13;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Human
        BirthDate birthDate1 = new BirthDate(12, 10, 2003);
        Human person = new Human();
        Human person1 = new Human("Назар", "Ляхович", "Юрійович", "Українська", "AB123456", birthDate1);


        // Встановлюємо значення полів за допомогою сетерів
        person.setFirstName("Ігор");
        person.setLastName("Ляхович");
        person.setSurname("Юрійович");
        person.setNationality("Українська");
        person.setIdDocument("AB123456");

        // Встановлюємо дату народження за допомогою сетера
        BirthDate birthDate = new BirthDate(12, 10, 2003);
        person.setBirthDate(birthDate);

        // Отримуємо значення полів за допомогою гетерів
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String surname = person.getSurname();
        String nationality = person.getNationality();
        String idDocument = person.getIdDocument();
        BirthDate personBirthDate = person.getBirthDate();

        // Виводимо інформацію про людину
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("По-батькові: " + surname);
        System.out.println("Національність: " + nationality);
        System.out.println("Ідентифікаційний документ: " + idDocument);
        System.out.println("Дата народження: " + personBirthDate);

        // Викликаємо інші методи класу
        person.printInitialsAndInfo();
        System.out.println("Повне ім'я: " + person.getFullName());
        System.out.println("Вік та статус: " + person.getAgeAndStatus());

        String additionalInfo = person.getAdditional("Проживає в Києві", "Середній ріст", "Футболіст");
        System.out.println(additionalInfo);
        System.out.println(person1);
    }
}




