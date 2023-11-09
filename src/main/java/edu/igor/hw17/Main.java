package edu.igor.hw17;

public class Main {
    public static void main(String[] args) {
        Person.Address address1 = new Person.Address("Пушкина_Карапушкина", "Бровари", "07500");
        Person.Address address2 = new Person.Address("Ти-ли-тиль", "Киев", "07400");

        Person person1 = Person.builder()
                .firstName("Ігор")
                .lastName("Ляхович")
                .phoneNumber("1234567890")
                .years(20)
                .address(address1)
                .build();

        Person person2 = Person.builder()
                .firstName("Алекс")
                .lastName("Хенг")
                .phoneNumber("9876543210")
                .years(28)
                .address(address2)
                .build();
        System.out.println(person2);
        System.out.println(person1);

        // Створення телефонної книги і додавання осіб
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson(person1);
        phoneBook.addPerson(person2);

        // Отримання і виведення списку людей з телефонної книги
        Person[] people = phoneBook.getPeople();
        System.out.println("Список людей в телефонній книзі:");

        for (Person person : people) {
            System.out.println(person.getFullName());
        }
    }
}


