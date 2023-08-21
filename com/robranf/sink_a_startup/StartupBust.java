package com.robranf.sink_a_startup;

import java.util.ArrayList;

public class StartupBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<>();
    private int numberOfGuesses = 0;

    public void setUpGame() {
        // Make some start-ups and give them locations
        Startup one = new Startup();
        one.setName("Hoolie");
        Startup two = new Startup();
        two.setName("Gooliebib");
        Startup three = new Startup();
        three.setName("Pied Piper");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three start-ups");
        System.out.println("Hoolie, Gooliebib, and Pied Piper");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numberOfGuesses++;
        String result = "Miss";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("Hit")) {
                break;
            }
            if (result.equals("Kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("All start-ups are dead. Your stock is now worthless.");
        if (numberOfGuesses <= 18) {
            System.out.printf("It only took you %d guesses.\n", numberOfGuesses);
            System.out.println("You got out before your options sank.");
        } else {
            System.out.printf("Took you long enough. %d guesses.\n", numberOfGuesses);
            System.out.println("Fish are dancing with your options.");
        }
    }
}
