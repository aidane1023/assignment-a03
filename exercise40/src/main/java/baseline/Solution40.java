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
        Map<Integer, Employee> employee = new HashMap<Integer, Employee>();

        //Make employee
        Employee John = new Employee("John", "Johnson", "Manager","2016-12-31");;
        employee.put(1, John);
        //repeat for all employees
        Employee xio = new Employee("Tou", "Xiong", "Software Engineer","2016-10-05");;
        employee.put(2, xio);
        Employee Mich = new Employee("Michaela", "Michaelson", "District Manager","2015-12-19");;
        employee.put(3, Mich);
        Employee Jaco = new Employee("Jake", "Jacobson", "Programmer","");;
        employee.put(4, Jaco);
        Employee Jack = new Employee("Jacquelyn", "Jackson", "DBA","");;
        employee.put(5, Jack);
        Employee Web = new Employee("Sally", "Webber", "Web Developer","2015-12-18");;
        employee.put(6, Web);

        //Add employee maps to list
        employeeList.add(employee);
        //Sort alphabetically

        //Print contents into a alphabetical table
        app.printTable(employeeList);
    }

    private void printTable(List<Map> employeeList) {


        //Print a format for table
    }

}
