package com.basics.stream;

public class Employee {
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;
}
