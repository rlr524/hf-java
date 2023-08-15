package com.robranf.dog;

public class DogTester {
    public static void main(String[] args) {
        Dog fido = new Dog();
        Dog thrawn = new Dog();

        thrawn.setWeight(8);
        thrawn.bark(10);

        fido.setWeight(70);
        fido.setBreed("Golden Retriever");
        fido.setName("Fido");
        fido.setColor("Brown");
        fido.bark(5);
        
        Dog[] pets;
        pets = new Dog[3];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();

        for (Dog pet : pets) {
            System.out.println(pet);
        }
    }
}
