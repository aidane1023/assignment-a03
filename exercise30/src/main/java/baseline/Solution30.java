/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
Use a nested loop to complete this program.
Align each column within the table without using the tab character.
 */
package baseline;

public class Solution30 {
    public static void main(String[] args) {
        Solution30 app = new Solution30();

        //Run loop to print contents of table
        app.printTableLoop();

    }

    private void printTableLoop() {
        //Declare necessary variables
        int a;
        int b;
        //Begin loop for 12 rows ()
        for (a =1; a <=12; ++a)
        {
            //Within row loop begin loop to print contents of 12 columns
            for (b=1; b<=12; ++b)
            {
                System.out.printf("%4d", a *b);
                //End column loop at end of each row and begin row loop again for each proceeding row
            }
            System.out.println();
            //End row loop after 12 rows printed
        }
    }
}
