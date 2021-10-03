/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Given the following data set,
create a program that sorts all employees by last name and prints them to the screen in a tabular format.
Store the data using a list of maps.
 */
package baseline;

import java.util.*;

public class Solution39 {
    public static void main(String[] args) {
        Solution39 app = new Solution39();
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

        //Print contents into a alphabetical table
        app.printTable(employeeList);
    }

    private void printTable(List<Map> employeeList) {
        //Print a format for table
    }

    private Employee newClassInstance() {
        return new Employee("", "", "","");
    }
}
