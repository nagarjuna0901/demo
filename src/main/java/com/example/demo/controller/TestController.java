package com.example.demo.controller;

import com.example.demo.service.ConverterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    ConverterService converterService;

    @GetMapping("/")
    public String getData() throws JsonProcessingException {
        System.out.println("This is just a simple project for illustrating map struct functionalities");
        converterService.convert();
        System.out.println("Always return success, no matter the response!!");
        return "success";
    }

}
