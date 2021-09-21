package com.training.spring.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.training.spring.Customer;

@Service
public class CustomerService {

    Map<String, Customer> customerMap = new ConcurrentHashMap<>();

    public void add(final Customer customerParam) {
        this.customerMap.put(customerParam.getUsername(),
                             customerParam);
    }

    public void delete(final String customerName) {
        this.customerMap.remove(customerName);
    }

    public void update(final Customer customerParam) {
        this.customerMap.put(customerParam.getUsername(),
                             customerParam);
    }


    public Customer get(final String customerName) {
        return this.customerMap.get(customerName);
    }


    public List<Customer> getAll() {
        return new ArrayList<>(this.customerMap.values());
    }

    public List<Customer> getByName(final String name) {
        List<Customer> custListLoc = new ArrayList<>();
        Collection<Customer> valuesLoc = this.customerMap.values();
        for (Customer customerLoc : valuesLoc) {
            if (customerLoc.getName()
                           .equals(name)) {
                custListLoc.add(customerLoc);
            }
        }
        return custListLoc;
    }

}
