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
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Solution34 app = new Solution34();
        //Initialize List
        List<String> list = new ArrayList<>();
        //Declare variable for user string
        String delete;

        //fill list
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
        //Print list
        System.out.println("There are "+ list.size() +" employees.");
        for(String names:list) {
            System.out.println(names);
        }

        //Ask user which employee they wish to remove
        delete = app.getStringFromUser(list);

        //remove correlating employee from list
        list.remove(delete);
        //Print new list
        System.out.println("There are "+ list.size() +" employees.");
        for(String names:list) {
            System.out.println(names);
        }
    }


    private String getStringFromUser(List<String> list) {
        //Prompt user for string
        System.out.println("Enter an employee name to remove:");
        //Read in data from user
        String delete = in.nextLine();
        //Make sure String matches item from list
        if (list.contains(delete)) {
            //return string
            return delete;
        }
        else {
            System.out.println("Must be a name from the list.");
            getStringFromUser(list);
        }
        //Loop if contains is false
        return null;
    }

    private static final Scanner in = new Scanner(System.in);
}
