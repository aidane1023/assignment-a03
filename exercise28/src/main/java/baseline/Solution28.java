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
    /*
    Flowchart:
    Prompt for and read in a number 5 times (arr[0] = number 1, arr[1] = number 2...)->
    add number 1 to sum -> add number 2 to sum -> add number 3 to sum -> add number 4 to sum -> add number 5 to sum
    print sum
     */
import java.util.Scanner;

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
        System.out.println("The total is "+ sum +".");
    }
    private void getUserDataLoop(double[] doubleArray) {
        //Begin loop
        for (int x = 1; x <= 5; x++) {
            //Prompt user for data
            System.out.println("Enter a number");
            //Assign data to array slot
            doubleArray[x-1] = in.nextDouble();
        }
        //End Loop after 5 successful data submissions
    }

    public double calcArraySum(double[] doubleArray) {
        double sum = 0;
        //add the values of the 5 doubles within the array
        for (int x = 0; x <= 4; x++) {
            sum = sum + doubleArray[x];
        }
        //return the sum
        return sum;
    }

    private static final Scanner in = new Scanner(System.in);
}
