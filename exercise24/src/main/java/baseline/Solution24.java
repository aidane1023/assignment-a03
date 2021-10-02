/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.
Implement the program using a function called isAnagram,
which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Solution24 app = new Solution24();
        //Declare 2 Strings A and B
        String A;
        String B;

        System.out.println("Enter two strings and I'll tell you if they're anagrams.");
        //Ask user to enter data for string A
        A = app.getStringFromUser("first");
        //Ask user to enter data for string B
        B = app.getStringFromUser("second");

        //Determine if two strings are anagrams of one another
        String result = app.isAnagram(A, B);

        //Print the result
        System.out.println(result);
    }

    String getStringFromUser(String x) {
        //Print input prompt
        System.out.println("Enter "+ x +" string:");
        //Read in String Data
        //Return String
        return in.nextLine();
    }

    String isAnagram(String a, String b) {
        //Determine if two strings are anagrams via sort function and string comp function
        //Test string length
        int n1 = a.length();
        int n2 = b.length();
        if (n1 != n2) {
            return a + " and " + b + " are not anagrams.";
        }
        //Test contents of string
        return sortString(a, b, n1);
    }

    public String sortString(String a, String b, int x) {
        //Converting string into an array for computation
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        //Sort for comparison
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted strings
        for (int i = 0; i < x; i++) {
            if (arr1[i] != arr2[i]) {
                return a + " and " + b + " are not anagrams.";
            }
        }

        return a + " and " + b + " are anagrams.";
    }

    private static final Scanner in = new Scanner(System.in);
}
