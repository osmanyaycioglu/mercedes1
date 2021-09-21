package com.training.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.Customer;

@RestController
@RequestMapping("/api/v1/customer/query")
public class CustomerQueryController {

    @Autowired
    CustomerService cs;

    @GetMapping("/get/one/{username}")
    public Customer get(@PathVariable("username") final String username) {
        return this.cs.get(username);
    }

    @GetMapping("/get/all")
    public List<Customer> getall() {
        return this.cs.getAll();
    }

    @GetMapping("/get/by/name/{username}")
    public List<Customer> getByName(@PathVariable("username") final String username) {
        return this.cs.getByName(username);
    }

}
