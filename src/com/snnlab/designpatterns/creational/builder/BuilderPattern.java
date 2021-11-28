package com.snnlab.designpatterns.creational.builder;



/**
 *
 *  Builder design pattern provides create complex object
 *
 *
 *
 *
 */
public class BuilderPattern {


    public static void main(String[] args) {

        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder();
        Employee employee = employeeBuilder.setAge(30).setDepartment("Technology Department").setName("Name Surname").build();

        System.out.println(employee.toString());
        // However builder inner class causes boiler plates code Free Builder library can be used;
    }
}
