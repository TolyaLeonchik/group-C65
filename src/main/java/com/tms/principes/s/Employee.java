package com.tms.principes.s;

import java.util.Date;

public class Employee{
    private int age;
    private String name;
    private int salary;
    private Date workTo;
    private String position;

    public void changeSalary(int salary){
        int k = 1;
        setSalary(salary + k);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void changeWorkDate(){

    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Date getWorkTo() {
        return workTo;
    }

    public String getPosition() {
        return position;
    }

    public Employee(int age, String name, int salary, Date workTo, String position) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.workTo = workTo;
        this.position = position;
    }
}
