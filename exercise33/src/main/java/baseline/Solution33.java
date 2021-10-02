/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) {
        Solution33 app = new Solution33();
        //Initialize List
        List<String> list = new ArrayList<>();
        // add contents of list
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later");

        //Ask user for String Data
        app.getStringFromUser();

        //Random number picker for each option from list
        int rand = app.numberPicker();
        //Return correlating string from array
        System.out.println(list.get(rand));
    }


    private void getStringFromUser() {
        //Prompt user for String data
        System.out.println();
        //Read in string
        in.nextLine();
    }

    public int numberPicker() {
        return (int)Math.floor(Math.random()*(3+1)+0);
    }

    private static final Scanner in = new Scanner(System.in);
}
