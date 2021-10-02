/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a Guess the Number game that has three levels of difficulty.
The first level of difficulty would be a number between 1 and 10.
The second difficulty set would be between 1 and 100.
The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game.
The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint whether the number is too high or too low.
The computer should also keep track of the number of guesses. Once the player guesses the correct number,
the computer should present the number of guesses and ask if the player would like to play again.

Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */
package baseline;

import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Solution32 app = new Solution32();
        //Declare variable for difficulty and selected number
        int difficulty;
        int number;

        //Ask user to enter data for difficulty
        difficulty = app.getIntFromUser("Enter the difficulty level (1, 2, or 3):");
        //Pick number based on selected difficulty
        number = app.numberPicker(difficulty);
        System.out.println("I have my number.\n");

        //Call functions for loop so It can be tested
        app.highLow(number);
    }

    private int getIntFromUser(String prompt) {
        int temp = 0;
        //Prompt user to enter int
        System.out.println(prompt);
        //Make sure data entered is an int
        try {
            temp = in.nextInt();
        }
        catch (Exception e) {
            System.out.println("Must enter a numerical value (1, 2, or 3).");
            getIntFromUser("Enter the difficulty level (1, 2, or 3):");
        }
        //Return int
        return temp;
    }

    public int numberPicker(int difficulty) {
        //Based on difficulty trigger one of three random number pickers
        int max = 2;
        int min = 1;
        //1-10 if difficulty 1
        if (difficulty == 1) {
            max = 10;
        }
        //1-100 if difficulty 2
        if (difficulty == 2) {
            max = 100;
        }
        //1-1000 if difficulty 3
        if (difficulty == 3) {
            max = 1000;
        }

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public void highLow(int number) {
        Solution32 app = new Solution32();
        int counter = 0;
        //begin loop
        while (true) {
            counter = counter + 1;
            //Ask user to enter data for guess
            int guess = app.getIntFromUser("What's your guess?");
            //Return high or low based on guess and number
            if (number > guess) {
                System.out.println("Too low. Guess again:");
            }
            else if (number < guess) {
                System.out.println("Too high. Guess again:");
            }
            //End loop when guess equals number
            else if (number == guess) {
                if (counter == 1) {
                    System.out.println("Correct! It took you 1 guess");
                }
                else {
                    System.out.println("Correct! It took you " + counter + " guesses.");
                }
                break;
            }
        }
    }

    private static final Scanner in = new Scanner(System.in);
}
