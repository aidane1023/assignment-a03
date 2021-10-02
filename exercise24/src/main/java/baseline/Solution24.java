/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

/*
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.
Implement the program using a function called isAnagram,
which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */
package baseline;

public class Solution24 {
    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Declare 2 Strings A and B
        String A;
        String B;

        //Ask user to enter data for string A
        A = app.getStringFromUser();
        //Ask user to enter data for string B
        B = app.getStringFromUser();

        //Determine if two strings are anagrams of one another
        String trueFalseGate = app.isAnagram(A, B);

        //Print the result

    }

    private String getStringFromUser() {
        //Print input prompt
        //Read in String Data
        //Return String
        return null;
    }

    private String isAnagram(String a, String b) {
        //Determine if two strings are anagrams via sort function and string comp function
        //Return true or false based on if strings are or are not anagrams
        return null;
    }
}
