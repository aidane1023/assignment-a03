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

import java.util.Arrays;
import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Solution38 app = new Solution38();
        //Initialize variable for user
        String numberList;

        //Ask user to enter data for string
        numberList = app.getStringFromUser();
        //Convert string to array
        int[] numbers = app.convertToArray(numberList);

        //sort into even and odds
        int[] evens = app.filterEvenNumbers(numbers);

        //Print resulting array
        System.out.println("The evens are: "+ Arrays.toString(evens));
    }

    private String getStringFromUser() {
        //Prompt user for list of numbers (w/ spaces)
        System.out.println("Enter a list of numbers, separated by spaces:");
        //Read in list as string
        //Return string
        return in.nextLine();
    }

    private int[] convertToArray(String numberList) {
        String[] items =numberList.split("\\s");
        int[] numbers = new int[items.length];
        //parseInt
        for (int i = 0; i < items.length; i++) {
            try {
                numbers[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("System error");
            }
        }
        return numbers;
    }
    
    private int[] filterEvenNumbers(int[] numbers) {
        //Initialize local array
        int[] evens = new int[0];
        //Apply logic for even
        for (int i = 0; i < numbers.length; i++) {
            if ( (numbers[i] & 1) != 0 ) {
                evens = removeIndex(numbers, i);
                numbers = evens;
            }
        }
        //Use a try catch gate to determine evens
        //Return new string containing only evens
        return evens;
    }

    private int[] removeIndex(int[] arr, int index) {
        //If the array is empty or the index is not in array range return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        //Create temp array one size smaller
        int[] anotherArray = new int[arr.length - 1];

        //Copy all elements except the index
        for (int i = 0, k = 0; i < arr.length; i++) {

            //Skip over index element
            if (i == index) {
                continue;
            }
            //Add other elements
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    private static final Scanner in = new Scanner(System.in);
}
