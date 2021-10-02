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

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution27 {
    public static void main(String[] args) {
        Solution27 app = new Solution27();
        //Declare String variables for first name, last name, employee ID, and zip
        String firstName;
        String lastName;
        String ID;
        String zip;

        //Ask user to enter Data for string firstName
        firstName = app.getStringFromUser("first name");
        //Ask user to enter Data for string lastName
        lastName = app.getStringFromUser("last name");
        //Ask user to enter Data for string ID
        ID = app.getStringFromUser("ID");
        //Ask user to enter Data for int zip
        zip = app.getStringFromUser("zip");
        
        //Validate data for first name
        String firstNameValid = app.validateName(firstName, "first");
        //Validate data for last name
        String lastNameValid = app.validateName(lastName, "last");
        //Validate data for ID
        String IDValid = app.validateID(ID);
        //Validate data for zip
        String zipValid = app.validateZip(zip);

        //Print results. Either list of errors or cleared statement
        app.printer(firstNameValid + lastNameValid + IDValid + zipValid);
    }
    private void printer(String str) {
        if (Objects.equals(str, "")) {
            str = "There were no errors found.";
        }
        System.out.println(str);
    }

    private String getStringFromUser(String prompt) {
        //Print input prompt
        printer("Enter the "+ prompt +":");
        //Read in String Data
        //Return String
        return in.nextLine();
    }

    public String validateName(String name, String prompt) {
        String errorMessage = "";
        //Ensure String isn't empty
        if (name == null) {
            errorMessage = errorMessage +"The "+ prompt +" name must be filled in.\n";
        }
        assert name != null;
        if (name.length() < 2) {
            errorMessage = errorMessage +"The "+ prompt +" name must be at least two characters long.\n";
        }
        //return appropriate error if necessary
        return errorMessage;
    }

    public String validateID(String ID) {
        String errorMessage;
        //Ensure ID has proper format AA-1234
        Pattern p = Pattern.compile(("^[a-z]{2}-[0-9]{4}$"), Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(ID);
        if (m.matches()) {
            errorMessage = "";
        }
        //return appropriate error if necessary
        else {
            errorMessage = "The employee ID must be in the format of AA-1234.\n";
        }
        return errorMessage;
    }

    public String validateZip(String zip) {
        //Ensure zip is a number
        try {
            Integer.parseInt(zip);
        }
        catch(Exception e) {
            //return appropriate error if necessary
            return "The zipcode must be a 5 digit number.\n";
        }
        // ensure length of 5
        if (zip.length() < 5) {
            //return appropriate error if necessary
            return "The zipcode must be a 5 digit number.\n";
        }
        return "";
    }

    private static final Scanner in = new Scanner(System.in);
}
