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

    public int printTableLoop() {
        //Declare necessary variables
        int row;
        int column;
        int result = 0;
        //Begin loop for 12 rows ()
        for (row =1; row <=12; ++row)
        {
            //Within row loop begin loop to print contents of 12 columns
            for (column=1; column<=12; ++column)
            {
                result = row * column;
                System.out.printf("%4d", result);
                //End column loop at end of each row and begin row loop again for each proceeding row
            }
            System.out.println();
            //End row loop after 12 rows printed
        }
        return result;
    }
}
