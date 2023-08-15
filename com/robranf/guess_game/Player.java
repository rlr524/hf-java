package com.robranf.guess_game;

public class Player {
    int number;

    void guess() {
        number = (int) (Math.random() * 10);
        System.out.printf("I'm guessing %d\n", number);
    }
}
