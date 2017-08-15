package com.wordpress.abhirockzz.jaxrs.sse;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.config.PropertyOrderStrategy;


@JsonbPropertyOrder(PropertyOrderStrategy.REVERSE)
public class Employee {
    
    @JsonbProperty("emp_email")
    private String email;
    private String name;
    private int salary;
    
    public Employee() {
    }

    public Employee(String email, String name, int salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "email=" + email + ", name=" + name + ", salary=" + salary + '}';
    }
    
    
}
