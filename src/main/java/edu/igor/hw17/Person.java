package edu.igor.hw17;
public class Person {
   private String firstName;
    private String lastName;
   private String phoneNumber;
    private int years;
    private Address address;
    private PhoneBook phoneBook;
    public Person() {
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public static class Address {
        private final String street;
        private final String city;
        private final String zipCode;

        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "Назва вулиці='" + street + '\'' +
                    ", Назва міста='" + city + '\'' +
                    ", Код міста='" + zipCode + '\'' +
                    '}';
        }
    }
public static  PersonBuilder builder(){
        return new PersonBuilder();
}


    public static final class PersonBuilder {
       Person person=new Person();

        private PersonBuilder() {
        }
        public PersonBuilder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            person.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder years(int years) {
            person.years = years;
            return this;
        }

        public PersonBuilder address(Address address) {
            person.address = address;
            return this;
        }

        public Person build() {
            return person;
        }
        }

    @Override
    public String toString() {
        return "Person{" +
                "Ім'я='" + firstName + '\'' +
                ", Фамілія='" + lastName + '\'' +
                ", Номер телефону ='" + phoneNumber + '\'' +
                ", Вік=" + years +
                ", Адреса=" + address +
                '}';

    }

}
