package com.ojas.java8.functionalinterface.lambda;

public class Demo {
    public static void main(String[] args) {
       /*
        SoftwareEngineer employee = new SoftwareEngineer();
        Employee employee1 = new SoftwareEngineer();
        employee.getName();
        employee1.getName();
       */

       Employee employee =  () -> "Software Engineer";
        System.out.println(employee.getName());

    }
}
