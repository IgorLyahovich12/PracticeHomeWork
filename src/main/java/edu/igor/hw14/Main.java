package edu.igor.hw14;

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
        BirthDate birthDateEmployee = new BirthDate(15, 5, 1990);

        // Створюємо об'єкт класу Employee
        Employee employee1 = new Employee("Іван", "Петров", "Олександрович", "Українець", "12345", birthDateEmployee, "Менеджер", 1);

        // Викликаємо методи класу Employee
        System.out.println(employee1.getEmployeeInfo());
        employee1.doWork();
        employee1.takeVacation(false);

        BirthDate birthDateStudent = new BirthDate(10, 3, 2000);

        // Створюємо об'єкт класу Student за допомогою другого конструктора
        Student student1 = new Student("Іван", "Петров", "Олександрович", "Українець", "12345",birthDateStudent, "S54321", "Математика", 190, 2);

        System.out.println("Інформація про студента 1:");
        System.out.println(student1.getStudentInfo());
        System.out.println("Статус вступу: " + student1.getEnrollmentStatus());
        System.out.println("Поточний курс: " + student1.getCourse());
        System.out.println("Кількість курсів до закінчення бакалаврату: " + student1.getBachelorCoursesLeft());
        System.out.println("Кількість курсів до закінчення магістратури: " + student1.getMasterCoursesLeft());
    }
}




