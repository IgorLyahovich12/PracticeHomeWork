package org.example.hw16;

public class Printer {
    private final String model;

    public Printer(String model) {
        this.model = model;
    }


    public String getModel() {
        return null;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "model='" + model + '\'' +
                '}';
    }
}