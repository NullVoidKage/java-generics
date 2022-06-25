package com.nullvoid.generics.box;

public class Fruit implements Boxable {
    private String name;
    private String countryOfOrigin;
    private String colour;
    private Double weight;

    public Fruit(String name, String countryOfOrigin, String colour, Double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.colour = colour;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getColour() {
        return colour;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", colour='" + colour + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
