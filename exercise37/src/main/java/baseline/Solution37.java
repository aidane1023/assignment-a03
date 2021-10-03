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
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        minLength = app.getIntFromUser("What's the minimum length?");
        totalNumbers = app.getIntFromUser("How many special characters?");
        totalSymbols = app.getIntFromUser("How many numbers?");

        //Run logic to determine how many letters needed
        int totalLetters = app.getTotalLetters(minLength, totalNumbers, totalSymbols);
        int length = totalLetters + totalNumbers + totalSymbols; //Sum of all totals
        
        //Build password
        
        String password = app.buildPassword(characters, length, totalNumbers, totalSymbols);

        //Return generated string
        System.out.println("Generated password is: "+ password);
    }

    private int getIntFromUser(String prompt) {
        int temp = 0;
        //Prompt user to enter data
        System.out.println(prompt);
        //Make sure data is valid
        try {
            temp = in.nextInt();
        }
        catch (Exception e) {
            System.out.println("Must enter an integer.");
            getIntFromUser(prompt);
        }
        //Return int
        return temp;
    }

    private String buildPassword(List<String> characters, int length, int numbers, int symbols) {
        //Initialize local variables
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());
        //initialize loop variables
        int num = 0;
        int sym = 0;
        //Begin loop

        for (int i = 0; i <= length + 3; i++) {
            int rand = ThreadLocalRandom.current().nextInt(0, 2 + 1);
            String charCategory = characters.get(rand);
            if (rand == 1) {
                num++;
                if (num > numbers) {
                    charCategory = characters.get(0);
                }
            }
            else if (rand == 2) {
                sym++;
                if (sym > symbols) {
                    charCategory = characters.get(0);
                }
            }
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        while (num < numbers) {
            String charCategory = characters.get(1);
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
            num++;
        }
        while (sym < symbols) {
            String charCategory = characters.get(2);
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
            sym++;
        }

        //End loop once string length it met

        //Return string
        return new String(password);
    }

    public int getTotalLetters(int l, int n, int s) {
        //Letters must be equal or greater to number of numbers and symbols combined
        int letters = n + s;
        if (l > (letters + n + s)) {
            letters = (l - (n + s));
        }
        return letters;
    }

    private static final Scanner in = new Scanner(System.in);
}
