package com.robranf.sink_a_startup;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    // private int numberOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }
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
    public String checkYourself(String userGuess) {
        String result = "Miss";
        int index = locationCells.indexOf(userGuess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}
