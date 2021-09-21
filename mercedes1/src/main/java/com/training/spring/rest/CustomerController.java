package com.training.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.Customer;

@RestController
@RequestMapping("/api/v1/customer/provision")
public class CustomerController {

    @Autowired
    CustomerService cs;

    @PostMapping("/add")
    public String add(@RequestBody final Customer customer) {
        this.cs.add(customer);
        return "Customer : " + customer.getUsername() + " added successfully.";
    }

    @PostMapping("/update")
    public String update(@RequestBody final Customer customer) {
        this.cs.update(customer);
        return "Customer : " + customer.getUsername() + " updated successfully.";
    }

    @GetMapping("/remove/{username}")
    public String remove(@PathVariable("username") final String username) {
        this.cs.delete(username);
        return "Customer : " + username + " deleted successfully.";
    }

}
