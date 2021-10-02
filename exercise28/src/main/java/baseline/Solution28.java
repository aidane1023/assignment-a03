/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a program that prompts the user for five numbers and computes the total of the numbers.
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */
package baseline;

public class Solution28 {
    //Declare 1 global double Array
    double[] doubleArray;

    public static void main(String[] args) {
        Solution28 app = new Solution28();


        //Ask user to enter data for array
        app.getUserDataLoop(app.doubleArray);
        
        //Calculate sum of variables in array
        double sum = app.calcArraySum(app.doubleArray);
        
        //Print prompt containing sum
    }
    private void getUserDataLoop(double[] doubleArray) {
        //Begin loop
        //Prompt user for data
        //Assign data to array slot
        //End Loop after 5 successful data submissions
    }

    private double calcArraySum(double[] doubleArray) {
        //add the values of the 5 doubles within the array
        //return the sum
        return 0;
    }
}
