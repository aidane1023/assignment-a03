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

public class Solution25 {
    public static void main(String[] args) {
        Solution25 app = new Solution25();
        //Declare 1 string, password
        String password;

        //Ask user to enter data for string password
        password = app.getStringFromUser();

        //Test password for strength conditionals
        int errorCount = app.passwordValidator(password);

        //Return Prompt based on password strength
    }

    private String getStringFromUser() {
        //Print input prompt
        //Read in String Data
        //Return String
        return null;
    }

    private int passwordValidator(String password) {
        //Determine if password has more than 8 characters
        //Determine if password has letters
        //Determine if password has numbers
        //Determine if password has symbols
        //return int based on how many conditions met
        return 0;
    }
}
