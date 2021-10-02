/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that determines the complexity of a given password based on these rules:
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Create a passwordValidator function that takes in the password as its argument and returns a value
you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */

package baseline;

import java.lang.String;
import java.util.regex.*;

public class Solution25 {
    public static void main(String[] args) {
        Solution25 app = new Solution25();
        //Declare 1 array, password
        String[] password = {"12345", "abcde", "abc123", "abcd1234", "24wib9%$dgn"};

        //Test password for strength conditionals
        app.passwordValidator(password);

        //Return Prompt based on password strength
    }

    void passwordValidator(String[] password) {
        for (int x = 1; x <= 5; x++) {
        //Determine if password has more than 8 characters
        int n1 = password[x].length();
        //Determine if password has letters
        boolean alphabet = checkAlphabet(password[x]);
        //Determine if password has numbers
        boolean numbers = checkNumbers(password[x]);
        //Determine if password has symbols
        boolean symbols = checkSymbols(password[x]);
        //Run print statement assessment
        printAssessment(n1, alphabet,numbers,symbols, password[x]);
        }
    }
    public boolean checkAlphabet(String s) {
        if (s == null) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
          // checks whether the character is a letter
          if ((Character.isLetter(s.charAt(i)))) {
              return true;
          }
        }
      return false;
    }
    public boolean checkNumbers(String s) {
        if (s == null) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // checks whether the character is a number
            if ((Character.isDigit(s.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    public boolean checkSymbols(String s) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        return m.find();
    }

    void printAssessment(int n1,boolean letter,boolean number,boolean symbol, String s) {
        String strength = null;
        if (number) {
            strength = "The password "+ s +" is a very weak password.";
        }
        if (letter) {
            strength = "The password "+ s +" is a weak password.";
        }
        if (letter && number) {
            strength = "The password "+ s +"is a weak password.";
        }
        if (letter && number && n1 >= 8) {
            strength = "The password "+ s +" is a strong password.";
        }
        if (letter && number && symbol && n1 >= 8) {
            strength = "The password "+ s +" is a very strong password.";
        }
        System.out.println(strength);
    }
}
