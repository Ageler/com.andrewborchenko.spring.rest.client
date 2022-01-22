package com.andrewborchenko.spring.rest.entity;

import lombok.Data;

@Data
public class Employee {

    private int id;


    private String name;


    private String surname;


    private String department;


    private int salary;

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
}
