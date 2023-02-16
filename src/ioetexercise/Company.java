package ioetexercise;

import java.util.ArrayList;

public class Company {

    String name;
    ArrayList <Employee> employees;

    public Company() {
        this.employees=new ArrayList<>();  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    
    
}

