/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a program that will help you determine how many months it will take to pay off a credit card balance.
The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment.
The program should then return the number of months needed (rounded up to the next integer value).
The formula for this is: n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which returns the number of months.
Round fractions of a cent up to the next cent.
 */

package baseline;

public class Solution26 {
    public static void main(String[] args) {
        Solution26 app = new Solution26();
        //Declare 2 doubles: Balance, Monthly
        double balance;
        double monthly;
        //Declare 1 int: APR
        double APR;

        //Ask user to enter data for double Balance
        balance = app.getDoubleFromUser();
        //Ask user to enter data for int APR
        APR = app.getIntFromUser();
        //Ask user to enter data for double monthly
        monthly = app.getDoubleFromUser();

        //Calculate time needed to pay off balance
        double time = app.calcTime(balance, APR, monthly);

    }

    private int getIntFromUser() {
        //Print input prompt
        //Read in int Data
        //Return int
        return 0;
    }

    private double getDoubleFromUser() {
        //Print input prompt
        //Read in double Data
        //Return double
        return 0;
    }

    private double calcTime(double balance, double apr, double monthly) {
        //plug user data into provided formula
        //return number of months for balance to be paid off
        return 0;
    }
}
