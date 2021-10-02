/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Create a function for each type of validation you need to write.
Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
 */

package baseline;

public class Solution27 {
    public static void main(String[] args) {
        Solution27 app = new Solution27();
        //Declare String variables for first name, last name, and employee ID
        String firstName;
        String lastName;
        String ID;
        //Declare int variable for Zip
        int zip;

        //Ask user to enter Data for string firstName
        firstName = app.getStringFromUser();
        //Ask user to enter Data for string lastName
        lastName = app.getStringFromUser();
        //Ask user to enter Data for string ID
        ID = app.getStringFromUser();
        //Ask user to enter Data for int zip
        zip = app.getIntFromUser();
        
        //Validate data for first name
        String firstNameValid = app.validateName(firstName);
        //Validate data for last name
        String lastNameValid = app.validateName(lastName);
        //Validate data for ID
        String IDValid = app.validateID(ID);
        //Validate data for zip
        String zipValid = app.validateZip(zip);

        //Print results. Either list of errors or cleared statement
    }

    private String getStringFromUser() {
        //Print input prompt
        //Read in String Data
        //Return String
        return null;
    }

    private int getIntFromUser() {
        //Print input prompt
        //Read in int Data
        //Return int
        return 0;
    }

    private String validateName(String name) {
        //Ensure String isn't empty
        //return appropriate error if necessary
        return null;
    }

    private String validateID(String ID) {
        //Ensure ID has proper format AA-1234
        //return appropriate error if necessary
        return null;
    }

    private String validateZip(int zip) {
        //Ensure zip is a number
        //return appropriate error if necessary
        return null;
    }
}
