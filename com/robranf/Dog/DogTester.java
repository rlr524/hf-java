package com.robranf.Dog;

public class DogTester {
    public static void main(String[] args) {
        Dog fido = new Dog();

        fido.weight = 70;
        fido.breed = "Golden Retriever";
        fido.name = "Fido";
        fido.color = "Brown";
        fido.bark();
    }
}
