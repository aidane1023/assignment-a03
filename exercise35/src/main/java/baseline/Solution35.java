/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.

Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
You may need to find another data structure, like an ArrayList.
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution35 {
    public static void main(String[] args) {
        Solution35 app = new Solution35();
        //Initialize List
        List<String> list = new ArrayList<String>();
        //Declare variable for user string
        String name;

        //Begin loop
        //Ask user to enter data for string
        name = app.getStringFromUser();
        //Add name to list
        list.add(name);
        //if blank is entered break loop (don't add to list)

        //Random number selection
        //Print correlating name as winner
    }

    private String getStringFromUser() {
        //Prompt user to enter data for string
        //Read in data for string
        return null;
    }

}
