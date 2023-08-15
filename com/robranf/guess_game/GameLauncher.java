package com.robranf.guess_game;

import java.util.Arrays;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();

        int x = 24;
        byte b = (byte) x;

        byte y = (byte) 256; // Will wrap around to 0 and return 0...casting it tells the compiler (and IntelliJ)
        // that you are sure you want a byte, so give me one. Since the max value of a byte is 127, it just does
        // what it's told and returns you an int, which is zero.
        System.out.println(y);

        String[] band = {"Rosé", "Jisoo", "Lisa", "Jennie"};
        long members = Arrays.stream(band).count();
        System.out.println(members);
    }
}
