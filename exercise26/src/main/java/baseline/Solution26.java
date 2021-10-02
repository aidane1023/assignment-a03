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

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args) {
        Solution26 app = new Solution26();
        //Declare payment calculator
        paymentCalculator A;

        //Ask user to enter data for double values
        A = app.getDataFromUser();

        //Calculate time needed to pay off balance
        double months = app.calculateMonthsUntilPaidOff(A.b, A.i, A.p);

        //Print Results
        System.out.println("It will take you "+ months +" months to pay off this card.");

    }

    private double calculateMonthsUntilPaidOff(double b, double i, double p) {
        return -(0.033333333) * Math.log(1 + b/p * (1 - Math.pow(1 + i,30)) / Math.log(1 + i));
    }

    private paymentCalculator getDataFromUser() {
        //Print input prompt
        System.out.println("What is your balance?");
        //Read in double Data
        double balance = in.nextDouble();
        //Print input prompt
        System.out.println("What is the APR on the card (as a percent)?");
        //Read in double Data
        double APR = in.nextDouble();
        APR = APR / 100;
        //Print input prompt
        System.out.println("What is the monthly payment you can make?");
        //Read in double Data
        double monthly = in.nextDouble();
        //Return
        return new paymentCalculator(balance, APR, monthly);
    }

    private static final Scanner in = new Scanner(System.in);
}
