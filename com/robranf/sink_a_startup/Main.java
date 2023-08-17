package com.robranf.sink_a_startup;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberOfGuesses = 0;

        GameHelper helper = new GameHelper();
        Startup startup = new Startup();

        Random rand = new Random();
        int randomNum = rand.nextInt(5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        startup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("Enter a number");
            String result = startup.checkYourself(guess);
            numberOfGuesses++;
            if (result.equals("Kill")) {
                isAlive = false;
                System.out.printf("You took %d guesses", numberOfGuesses);
            }
        }
    }
}