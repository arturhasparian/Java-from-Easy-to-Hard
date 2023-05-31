package com.javacode.constructors;

import com.javacode.domainmodel.Employee;


public class ConstructorMain {
    public static void main(String[] args){
        Employee employee = new Employee("Jack","developer",1500);
        Employee employee1 = new Employee("Oggy","developer",1500);
        System.out.println(employee);
        System.out.println(employee1);

        Employee employee2 = new Employee();
        System.out.println(employee2);
    }
}
