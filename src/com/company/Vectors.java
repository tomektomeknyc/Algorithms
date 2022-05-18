package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by Tom on 5/18/2022.
 */
public class Vectors {

    public static void main(String[] args){
        List <Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe",4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
int i;
   for(i = 0; i <= employeeList.size(); i++) {
       System.out.print(employeeList);


   }

    }
}
