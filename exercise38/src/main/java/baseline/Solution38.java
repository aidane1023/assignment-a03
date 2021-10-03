/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.
Convert the input to an array.
Write your own algorithm
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the old array and returns the new array.
 */
package baseline;

public class Solution38 {
    public static void main(String[] args) {
        Solution38 app = new Solution38();
        //Initialize variable for user
        String numberList;

        //Ask user to enter data for string
        numberList = app.getStringFromUser();
        //Convert string to array
        int[] numbers = new int[0];
        //parseInt

        //sort into even and odds
        int[] evens = app.filterEvenNumbers(numbers);
        
        //Print resulting array
    }

    private String getStringFromUser() {
        //Prompt user for list of numbers (w/ spaces)
        //Read in list as string
        //Return string
        return null;
    }
    
    private int[] filterEvenNumbers(int[] numbers) {
        //Initialize local array
        int[] evens = new int[0];
        //Apply logic for even
        //Use a try catch gate to determine evens
        //Return new string containing only evens
        return evens;
    }
}
