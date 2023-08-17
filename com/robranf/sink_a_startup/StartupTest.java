package com.robranf.sink_a_startup;

public class StartupTest {
    public static void main(String[] args) {
        Startup dot = new Startup();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if (result.equals("Hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
