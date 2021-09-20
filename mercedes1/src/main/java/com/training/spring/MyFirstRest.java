package com.training.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1/customer/provision")
public class MyFirstRest {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello2/{isim}")
    public String hello2(@PathVariable("isim") final String name) {
        return "Hello 2 " + name;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam("isim") final String name,
                         @RequestParam("soyisim") final String surname) {
        return "Hello 3 " + name + " " + surname;
    }

    @GetMapping("/hello4/name/{isim}/surname/{soyisim}")
    public String hello4(@PathVariable("isim") final String name,
                         @PathVariable("soyisim") final String surname) {
        return "Hello 4 " + name + " " + surname;
    }

    @PostMapping("/hello5")
    public String hello5(@RequestBody final Customer customer) {
        return "Hello 5 " + customer.getName() + " " + customer.getSurname() + " h:" + customer.getHeight();
    }

}
