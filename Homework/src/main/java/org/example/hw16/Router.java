package org.example.hw16;

public class Router {
    private final String model;

    public Router(String model) {
        this.model = model;
    }



    @Override
    public String toString() {
        return "Router{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return null;
    }
}
