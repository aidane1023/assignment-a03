/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Given the following data set create a program that lets a user locate all records that match the search string
by comparing the search string to the first or last name field.
Store the data using a list of maps.
 */
package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution40 {
    public static void main(String[] args) {
        Solution40 app = new Solution40();

        //Initialize list
        List<Map> employeeList = new ArrayList<>();
        //Initialize maps
        Map<Integer, Employee> employee
                = new HashMap<Integer, Employee>();

        //Make employees
        Employee info = app.newClassInstance();
        employee.put(1, info);
        //repeat for all employees

        //Add employee maps to list
        employeeList.add(employee);

        //Ask user to enter a string
        String key = app.getStringFromUser();
    }

    private String getStringFromUser() {
        //Prompt user for string data
        //Read in string data
        //Return string data
        return null;
    }

    private Employee newClassInstance() {
        return new Employee("", "", "","");
    }
}
