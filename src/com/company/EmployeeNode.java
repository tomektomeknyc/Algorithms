package com.company;

/**
 * Created by Tom on 5/18/2022.
 */
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode (Employee employee){
        this.employee = employee;
    }
    public Employee getEmployee(){
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public EmployeeNode getNext() {
        return next;
    }
    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    public String toString(){
        return employee.toString();
    }

    public static void main(String[] args){
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith",22);
        Employee mikeWilson = new Employee ("Mike", "Wilson", 3245);
        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();



    }

}
