/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that generates a secure password.
Prompt the user for the minimum length, the number of special characters, and the number of numbers.
Then generate a password for the user using those inputs.
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution37 {
    public static void main(String[] args) {
        Solution37 app = new Solution37();
        //Initialize list of strings containing possible characters
        List<String> characters = new ArrayList<>();
        //Add strings to list
        characters.add("abcdefghijklmnopqrstuvwxyz"); //letters
        characters.add("0123456789"); //numbers
        characters.add("^$?!@#%&"); //symbols

        //Initialize variables for user
        int minLength;
        int totalNumbers;
        int totalSymbols;

        //Ask user to enter data for ints
        minLength = app.getIntFromUser();
        totalNumbers = app.getIntFromUser();
        totalSymbols = app.getIntFromUser();

        //Run logic to determine how many letters needed
        int totalLetters = app.getTotalLetters();
        int lenght = 0; //Sum of all totals
        
        //Build password
        
        String password = app.buildPassword(characters, lenght);

        //Return generated string
    }

    private int getIntFromUser() {
        //Prompt user to enter data
        //Make sure data is valid
        //Return int
        return 0;
    }

    private String buildPassword(List<String> characters, int length) {
        //Initialize local variables
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());
        //logic for how many of each character

        //Begin loop
        //Select character type count based on solved logic
        //Enter character type into string at random position
        //End loop once string length it met

        //Return string
        return null;
    }

    private int getTotalLetters() {
        //Letters must be equal or greater to number of numbers and symbols combined
        return 0;
    }
}
