/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”
The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */
package baseline;



public class Solution36 {

    public static void main(String[] args) {
        Solution36 app = new Solution36();
        //Initialize global array for user data
        int[] arrayMilliseconds = new int[0];
        //Initialize variables for math functions
        double average;
        double std;
        int max;
        int min;

        //Ask user to enter data for the int array
        arrayMilliseconds = app.getIntFromUser(arrayMilliseconds);

        //Get average from array of ints
        average = app.average();
        //Get maximum from array of ints
        max = app.max();
        //Get minimum from array of ints
        min = app.min();
        //Get standard deviation from array of ints
        std = app.std();

        //Print output results

    }

    private int[] getIntFromUser(int[] arrMilli) {
        //Begin loop
        //Prompt user to enter data for int
        //Try to read in int to array slot
        //Catch if data is not an int
        //Break loop if data was "done"
        //Play error message and loop if data was anything else

        //Return completed array
        return arrMilli;
    }

    private double average() {
        //Add all ints from array
        //Divide by number of ints in array
        //Return result
        return 0;
    }

    private int max() {
        //Find max of array
        //Use if else and local variable
        return 0;
    }

    private int min() {
        //Find min of array
        //Use if else and local variable
        return 0;
    }

    private double std() {
        //Calculate std from average
        //Use a for loop
        return 0;
    }
}
