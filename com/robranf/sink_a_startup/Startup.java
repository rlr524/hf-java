package com.robranf.sink_a_startup;

public class Startup {
    private int[] locationCells;
    private int numberOfHits = 0;

    /*
    METHOD String checkYourself(int userGuess)
        GET the user guess as an int parameter
        REPEAT with each of the location cells in the int array
            // COMPARE the user guess to the location cell
            IF the user guess matches
                INCREMENT the number of hits
                // FIND OUT if it was the last location cell
                IF number of hits is 3, RETURN "Kill" as the result
                ELSE it was not a kill, so RETURN "Hit"
                END if
            ELSE the user guess did not match, so RETURN "Miss"
            END if
        END REPEAT
    END METHOD
    */
    public String checkYourself(int userGuess) {
        String result = "Miss";

        for (int cell : locationCells) {
            if (userGuess == cell) {
                result = "Hit";
                numberOfHits++;
                break;
            }
        }
        if (numberOfHits == locationCells.length) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }

    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(int numberOfHits) {
        this.numberOfHits = numberOfHits;
    }
}
