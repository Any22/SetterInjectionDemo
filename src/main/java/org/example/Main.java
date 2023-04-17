package org.example;

import org.example.dto.CustomerDTO;
import org.example.service.CustomerService;
import org.example.utility.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerService customerService= (CustomerService) context.getBean("customerServiceBean");

         customerService.getCustomer(3);

    }
}