package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 5/15/2022.
 */
public class Array_List {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike","Wilson",3245));
        employeeList.set(1, new Employee("John", "Adams", 4668));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(" Adding  John Does to index 3");

        employeeList.add(3, new Employee("John", "Does", 4567));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(" Employee with  index 1");
  System.out.println(employeeList.get(1));
  System.out.println("Is the array list empty?");
  System.out.println(employeeList.isEmpty());
  System.out.println("The size:");
  System.out.println(employeeList.size());

  Employee [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
  for (Employee employee: employeeArray) {
      System.out.println(employee);

  }
System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
  System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

  employeeList.remove(2);
  System.out.println("Removing employee with index 2");
  employeeList.forEach(employee -> System.out.println(employee));

    }

}
