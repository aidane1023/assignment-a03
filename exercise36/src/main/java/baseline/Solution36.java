/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters done.
The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */
package baseline;


import java.util.Objects;
import java.util.Scanner;

public class Solution36 {
    //Initialize global arrays for user data
    int[] arrayMilliseconds = new int[200];

    public static void main(String[] args) {
        Solution36 app = new Solution36();
        //Initialize variables for math functions
        double average;
        double std;
        int max;
        int min;
        int count;

        count = app.getIntFromUser();


        //Get average from array of ints
        average = app.average(count);
        //Get maximum from array of ints
        max = app.max();
        //Get minimum from array of ints
        min = app.min(count);
        //Get standard deviation from array of ints
        std = app.std(average, count);

        //Print output results
        System.out.println("The average is :"+ average);
        System.out.println("The maximum is :"+ max);
        System.out.println("The minimum is :"+ min);
        System.out.println("The standard deviation is :"+ std);
    }

    private int getIntFromUser() {
        String temp;
        int tempInt = 0;
        int counter = 0;
        while (true) {
            //Prompt user for data
            System.out.println("Enter a number:");
            temp = in.nextLine();
            try {
                tempInt = Integer.parseInt(temp);
            } catch (Exception e) {
                if (Objects.equals(temp, "done")) {
                    break;
                } else {
                    System.out.println("Must enter an integer");
                    getIntFromUser();
                }
            }
            counter++;
            arrayMilliseconds[counter-1] = tempInt;
        }
        return counter;
    }

    double average(int count) {
        int sum = 0;
        //Add all ints from array
        for (int i = 0; i < count; i++) {
            sum = sum + arrayMilliseconds[i];
        }
        //Divide by number of ints in array
        //Return result
        return sum / count;
    }

    int max() {
        int max = arrayMilliseconds[0];
        //Find max of array
        for (int i : arrayMilliseconds) {
            //Use if else and local variable
            if (max <= i) {
                max = i;
            }
        }
        return max;
    }

    int min(int count) {
        int min = arrayMilliseconds[0];
        //Find min of array
        for (int i = 0; i < count; i++) {
            //Use if else and local variable
            if (min >= i) {
                min = arrayMilliseconds[i];
            }
        }
        return min;
    }

    double std(double average, int count) {
        //Calculate std from average
        double SD = 0;
        //Use a for loop
        for(int i = 0; i < count; i++) {
            SD += Math.pow(arrayMilliseconds[i] - average, 2);
        }

        return Math.sqrt(SD / count);
    }

    private static final Scanner in = new Scanner(System.in);
}
