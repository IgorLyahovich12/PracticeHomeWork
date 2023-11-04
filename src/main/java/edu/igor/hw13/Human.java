package edu.igor.hw13;


import java.time.LocalDate;
import java.time.Period;

public class Human {
    protected String firstName;
    protected String lastName;
    protected String surname;
    protected String nationality;
    protected String idDocument;
    protected BirthDate birthDate;

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public Human() {
    }

    public Human(String firstName, String lastName, String surname, String nationality, String idDocument, BirthDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.nationality = nationality;
        this.idDocument = idDocument;
        this.birthDate = birthDate;
    }

    public void printInitialsAndInfo() {
        char firstInitial = firstName.charAt(0);
        char thirdInitial = lastName.charAt(0);
        char lastInitial = surname.charAt(0);
        String idDocumentLastDigits = idDocument.substring(idDocument.length() - 3);

        System.out.println("Ініціали: " + firstInitial + "." + thirdInitial + "." + lastInitial);
        System.out.println("Національність: " + nationality);
        System.out.println("Останні 3 цифри ідентифікатора: " + idDocumentLastDigits);
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + surname;

    }

    public static int AgeCalculator(BirthDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        int year = birthDate.getYear();
        int month = birthDate.getMonth();
        int day = birthDate.getDay();

        if (year < 1900 || year > currentDate.getYear() || month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Некоректна дата народження");
        }

        LocalDate birthDateLocal = LocalDate.of(year, month, day);
        Period age = Period.between(birthDateLocal, currentDate);
        return age.getYears();
    }

    public String getAgeAndStatus() {
        int years = AgeCalculator(this.getBirthDate());
        String status;

        if (years < 6) {
            status = "Child";
        } else if (years < 18) {
            status = "Schoolchild";
        } else if (years < 25) {
            status = "Student";
        } else if (years < 60) {
            status = "Adult";
        } else {
            status = "Senior Citizen";
        }

        return years + " years old (" + status + ")";
    }

    public String getAdditional(String... params) {
        StringBuilder sb = new StringBuilder();
        for (String param : params) {
            sb.append(param);
            sb.append(" ");
        }
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", idDocument='" + idDocument + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}






