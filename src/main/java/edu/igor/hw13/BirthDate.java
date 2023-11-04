package edu.igor.hw13;

public class BirthDate {
    private final int day;
    private final int month;
    private final int year;

    public BirthDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return year + "." + month + "." + day;
    }
}