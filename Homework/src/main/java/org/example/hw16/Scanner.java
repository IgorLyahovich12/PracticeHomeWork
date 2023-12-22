package org.example.hw16;

public class Scanner {
    private final String model;

    public Scanner(String model) {
        this.model = model;
    }



    @Override
    public String toString() {
        return "Scanner{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return null;
    }
}