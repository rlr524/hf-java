package com.robranf.phrase_o_matic;

import java.util.Random;

public class PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT",
                "cloud native", "service oriented", "containerized", "serverless", "microservices",
                "distributed ledger"};

        String[] wordListThree = {"framework", "library", "DSL", "Rest API", "repository", "pipeline", "service mesh",
                "architecture", "perspective", "design", "orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        Random randomGenerator = new Random();
        int randOne = randomGenerator.nextInt(oneLength);
        int randTwo = randomGenerator.nextInt(twoLength);
        int randThree = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        if (phrase.toLowerCase().startsWith("a") || phrase.toLowerCase().startsWith("e")
                || phrase.toLowerCase().startsWith("i") || phrase.toLowerCase().startsWith("o")
                || phrase.toLowerCase().startsWith("u")) {
            System.out.println("What we need is an " + phrase);
        } else {
            System.out.println("What we need is a " + phrase);
        }
    }
}
