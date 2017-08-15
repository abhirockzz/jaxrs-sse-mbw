package com.wordpress.abhirockzz.jaxrs.sse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
    
    private String email;
    private String name;
    
    public Customer() {
    }

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
 

    @Override
    public String toString() {
        return "Employee{" + "email=" + email + ", name=" + name + '}';
    }
    
    
}
