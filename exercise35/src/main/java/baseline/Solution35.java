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
import java.util.Objects;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Solution35 app = new Solution35();
        //Initialize List
        List<String> list = new ArrayList<>();
        //Declare variable for user string
        String name;


        //Begin loop
        int counter = 0;
        while (true) {
            counter = counter + 1;
            //Ask user to enter data for string
            name = app.getStringFromUser();

            if (Objects.equals(name, "")) {
                //if blank is entered break loop (don't add to list)
                counter = counter - 1;
                break;
            }
            else {
                //Add name to list
                list.add(name);
            }
        }

        //Random number selection
        int rand = app.randomNumberGenerator(counter);
        //Print correlating name as winner
        System.out.println("And the winner is..."+ list.get(rand));
    }

    private String getStringFromUser() {
        //Prompt user to enter data for string
        System.out.println("Enter a name:");
        //Read in data for string
        return in.nextLine();
    }

    public int randomNumberGenerator(int counter) {
       return (int)Math.floor(Math.random()*(counter+1)+0);
    }

    private static final Scanner in = new Scanner(System.in);
}
