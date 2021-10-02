/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a quick calculator that prompts for the rate of return on an investment
and calculates how many years it will take to double your investment.
The formula is years = 72 / r
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
 */
package baseline;

public class Solution29 {
    public static void main(String[] args) {
        Solution29 app = new Solution29();
        //Declare double variable for rate
        double rate;

        //Ask user to enter data for double
        rate = app.getDoubleFromUser();

        //Calculate the time in years
        double years = app.calcTime(rate);

        //print the result
    }

    private double getDoubleFromUser() {
        //Begin loop
        //Prompt user for rate of return
        //Cross-check provided data with conditional
        //If conditionals not met restart loop
        //Else end loop and return double
        return 0;
    }

    private double calcTime(double rate) {
        //enter user data into provided formula
        //return resulting double
        return 0;
    }
}
