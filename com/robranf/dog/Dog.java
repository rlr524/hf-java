package com.robranf.dog;

public class Dog {
    private int weight;
    private String breed;
    private String name;
    private String color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (weight > 60) {
                System.out.println("Woof, woof!");
            } else if (weight > 15) {
                System.out.println("Ruff, ruff!");
            } else {
                System.out.println("Yip, yip!");
            }

            numOfBarks = numOfBarks - 1;
        }
    }
}
