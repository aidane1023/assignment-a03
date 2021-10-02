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

public class Solution31 {
    public static void main(String[] args) {
        Solution31 app = new Solution31();
        //Declare variables for age and resting heart rate
        int age;
        int restBPM;

        //Ask user to enter data for int
        age = app.getIntFromUser();
        restBPM = app.getIntFromUser();


        //calculate target heart rate with provided data
        app.calcTargetHeartRate(age, restBPM);
    }

    private int getIntFromUser() {
        //Prompt user for int data
        //Ensure data is valid input (number)
        //Return read in data
        return 0;
    }

    public void calcTargetHeartRate(int age, int restBPM) {
        //Begin loop
        //assign current intensity. start at 55%, end at 95% (increments of 5)
        //Calculate target heart rate for current intensity
        //print target in tabloid format
        //end loop after printing target for 95%
    }
}
