/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.

Use an array or list to store the names.
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution34 {
    public static void main(String[] args) {
        Solution34 app = new Solution34();
        //Initialize List
        List<String> list = new ArrayList<String>();
        //Declare variable for user string
        String delete;

        //Add 5 employees to list
        list.add(""); // x5
        //Print list

        //Ask user which employee they wish to remove
        delete = app.getStringFromUser(list);

        //remove correlating employee from list
        list.remove(delete);
        //Print new list
    }

    private String getStringFromUser(List<String> list) {
        //Prompt user for string
        //Read in data from user
        //Make sure String matches item from list
        list.contains("");
        //Loop if contains is false
        //Return string
        return null;
    }
}
