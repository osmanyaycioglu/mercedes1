package com.training.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class MyFirstRest {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello/with/name/{isim}")
    public String hello2(@PathVariable("isim") final String name) {
        return "Hello with name " + name;
    }

    @GetMapping("/hello/with/query/param")
    public String hello3(@RequestParam("isim") final String name,
                         @RequestParam("soyisim") final String surname) {
        return "Hello with query param " + name + " " + surname;
    }

    @GetMapping("/hello/with/name/{isim}/with/surname/{soyisim}")
    public String hello4(@PathVariable("isim") final String name,
                         @PathVariable("soyisim") final String surname) {
        return "Hello with name and surname " + name + " " + surname;
    }

    @PostMapping("/hello/with/customer")
    public String hello5(@RequestBody final Customer customer) {
        return "Hello with customer " + customer.getName() + " " + customer.getSurname() + " h:" + customer.getHeight();
    }

}
