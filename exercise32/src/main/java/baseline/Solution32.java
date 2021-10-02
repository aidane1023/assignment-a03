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

public class Solution32 {
    public static void main(String[] args) {
        Solution32 app = new Solution32();
        //Declare variable for difficulty and selected number
        int difficulty;
        int number;

        //Ask user to enter data for difficulty
        difficulty = app.getIntFromUser();
        //Pick number based on selected difficulty
        number = numberPicker(difficulty);

        //Call functions for loop so It can be tested
        app.highLow(number);
    }

    private int getIntFromUser() {
        //Prompt user to enter int
        //Make sure data entered is an int
        //Return int
        return 0;
    }

    private static int numberPicker(int difficulty) {
        //Based on difficulty trigger one of three random number pickers
        //1-10 if difficulty 1
        //1-100 if difficulty 2
        //1-1000 if difficulty 3
        return 0;
    }

    public void highLow(int number) {
        //begin loop
        //Ask user to enter data for guess
        int guess = getIntFromUser();
        //Return high or low based on guess and number
        //End loop when guess equals number
    }
}
