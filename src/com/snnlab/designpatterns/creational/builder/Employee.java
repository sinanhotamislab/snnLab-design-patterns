package com.snnlab.designpatterns.creational.builder;

public class Employee {

    private final String name;
    private final Integer age;
    private final String department;

    private Employee(String name, Integer age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }



    //Inner static Builder class

    public static class EmployeeBuilder{

        private String name;
        private Integer age;
        private String department;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Employee build() {
            return new Employee(name, age, department);
        }

    }


    @Override
    public String toString() {
        return new StringBuilder().append(this.name).append(";").append(this.age).append(";").append(this.department).toString();
    }
}
