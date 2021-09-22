package com.training.spring;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.spring.soapws.CustomerWS;

@SpringBootApplication
public class Mercedes1Application {

    public static void main(final String[] args) {
        SpringApplication.run(Mercedes1Application.class,
                              args);
        Endpoint.publish("http://127.0.0.1:8081/api/customer",
                         new CustomerWS());
    }

}
