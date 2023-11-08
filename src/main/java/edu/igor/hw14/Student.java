package edu.igor.hw14;

public final class Student extends Human {
    private final String studentId;
    private final String majoring;
    private final int TheResultOfTheEntranceExam;
    private final int course;

    public Student(String firstName, String lastName, String surname, String nationality, String idDocument, BirthDate birthDate, String studentId, String majoring, int theResultOfTheEntranceExam, int course) {
        super(firstName, lastName, surname, nationality, idDocument, birthDate);
        this.studentId = studentId;
        this.majoring = majoring;
        this.TheResultOfTheEntranceExam = theResultOfTheEntranceExam;
        this.course = course;
    }
    public String getStudentInfo() {
        return " ID: " + studentId + ", Спеціальність: " + majoring + " ФІО " + getFullName() + " " + getEnrollmentStatus();
    }
    public String getEnrollmentStatus() {
        if (TheResultOfTheEntranceExam <= 160) {
            return "Студент навчається на контракті.";
        } else if (TheResultOfTheEntranceExam <= 200) {
            return "Студент навчається на бюджеті.";
        } else {
            return "Недійсний результат вступного екзамену.";
        }
    }
    public int getCourse() {
        return course;
    }
    public int getBachelorCoursesLeft() {
        return 4 - course;
    }
    public int getMasterCoursesLeft() {
        return 6 - course;
    }
}






