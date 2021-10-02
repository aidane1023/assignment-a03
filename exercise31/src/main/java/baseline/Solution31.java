/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
Generate a table with the results as shown in the example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */
package baseline;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Solution31 app = new Solution31();
        //Declare variables for age and resting heart rate
        int age;
        int restBPM;

        //Ask user to enter data for int
        age = app.getIntFromUser("age");
        restBPM = app.getIntFromUser("resting heart rate");

        //Begin formatting table
        System.out.println("Resting Pulse: "+ restBPM +"        Age:"+ age +"\n\n");
        System.out.println("Intensity    | Rate\n");
        System.out.println("-------------|--------\n");

        //Calculate target heart rate with provided data
        app.calcTargetHeartRate(age, restBPM);
    }

    private int getIntFromUser(String prompt) {
        int temp = 0;
        //Prompt user for int data
        System.out.println("Enter your "+ prompt +":");
        //Ensure data is valid input (number)
        try {
            temp = in.nextInt();
        }
        catch (Exception e) {
            System.out.println("Must enter numerical value.");
            getIntFromUser(prompt);
        }
        //Return read in data
        return temp;
    }

    public void calcTargetHeartRate(int age, int restBPM) {
        //assign current intensity. start at 55%, end at 95% (increments of 5)
        int intensity = 55;
        //Begin loop
        while (intensity <= 95) {
            //Calculate target heart rate for current intensity
            double targetHeartRate = Math.round((((220 - age) - restBPM) * (intensity/100)) + restBPM);
            //increment intensity
            intensity = intensity + 5;

            //print target in tabloid format
            System.out.println(intensity +"%          | "+ targetHeartRate +" bpm");
            //end loop after printing target for 95%
        }
    }

    private static final Scanner in = new Scanner(System.in);
}
