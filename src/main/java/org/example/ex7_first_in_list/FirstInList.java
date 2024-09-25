package org.example.ex7_first_in_list;

import java.util.ArrayList;
import java.util.List;

/*
    Create multiple instances of the Employee class and add them to a list. Using
    streams, find first Employee that is not null and has salary of at least 30000.
    If not found, throw exception.

    req:
        - create employe object class
        -in main create a List<employee> with multiple instances
        -find first Employee what is not null and has salay of at least 30000
        -if not found , throw exception or print a message

    input:
    Output:

*/
public class FirstInList {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();


        employeeList.add(new  Employee("Cristi", 3300));
        employeeList.add(new Employee("Vlad", 2900));
        employeeList.add(new Employee("Cristi", 3300));

        System.out.println(employeeList);
    }

    private static String employeefilterList(List<Employee> employeeList) {
        return null;

    }

}

