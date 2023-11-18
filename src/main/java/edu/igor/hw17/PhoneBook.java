package edu.igor.hw17;
public class PhoneBook {
    private static final int MAX_SIZE = 100;
    private final Person[] people;
    private int size;

    public PhoneBook() {
        this.people = new Person[MAX_SIZE];
        this.size = 0;
    }

    public void addPerson(Person person) {
        if (size < MAX_SIZE) {
            people[size++] = person;
            System.out.println("Особу додано до телефонної книги: " + person.getFullName());
        } else {
            System.out.println("Телефонна книга заповнена. Неможливо додати більше людей.");
        }
    }

    public Person[] getPeople() {

        Person[] result = new Person[size];
        System.arraycopy(people, 0, result, 0, size);
        return result;
    }
}