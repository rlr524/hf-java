package com.robranf.bottle_song;

public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + " green " + word + " of beer on the wall");
            System.out.println(bottlesNum + " green " + word + " of beer");
            System.out.println("And if one of them should happen to fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 1) {
                System.out.println("They'll be " + bottlesNum + " green " + word + " of beer on the wall");
            } else if (bottlesNum == 1) {
                System.out.println("They'll be " + bottlesNum + " green bottle of beer on the wall");
            }
            else {
                System.out.println("There'll be no more green bottles hanging on the wall.");
            }
        }
    }
}