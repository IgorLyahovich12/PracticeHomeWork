package edu.igor.hw14;

public final class Employee extends Human {
    private final String jobTitle;
    private final int employeeId;

    public Employee(String firstName, String lastName, String surname, String nationality, String idDocument, BirthDate birthDate, String jobTitle, int employeeId) {
        super(firstName, lastName, surname, nationality, idDocument, birthDate);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }


    public String getEmployeeInfo() {
        return "Employee ID: " + employeeId + ",Назва посади: " + jobTitle;
    }

    public void doWork() {
        System.out.println(getFullName() + " працює над своєю роботою: " + jobTitle);
    }

    public void takeVacation(boolean birthDate) {
        if (birthDate) {
            System.out.println(firstName + " перебуває у відпустці з нагоди  свого дня народження.");
        } else {
            System.out.println(firstName + " знаходиться у звичайній  відпустці.");
        }
    }

}