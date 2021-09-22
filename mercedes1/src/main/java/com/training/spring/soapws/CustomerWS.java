package com.training.spring.soapws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.training.spring.Customer;
import com.training.spring.rest.CustomerService;

@WebService
public class CustomerWS {


    CustomerService cs = new CustomerService();

    public String add(@WebParam(name = "customer") final Customer customer) {
        this.cs.add(customer);
        return "Customer : " + customer.getUsername() + " added successfully.";
    }

    public String update(@WebParam(name = "customer") final Customer customer) {
        this.cs.update(customer);
        return "Customer : " + customer.getUsername() + " updated successfully.";
    }

    public String remove(@WebParam(name = "username") final String username) {
        this.cs.delete(username);
        return "Customer : " + username + " deleted successfully.";
    }

    public Customer get(@WebParam(name = "username") final String username) {
        return this.cs.get(username);
    }

    public List<Customer> getall() {
        return this.cs.getAll();
    }

    public List<Customer> getByName(@WebParam(name = "name") final String username) {
        return this.cs.getByName(username);
    }


}
