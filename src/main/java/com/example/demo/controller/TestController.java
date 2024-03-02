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
        System.out.println("this is just a simple project for illustrating mapper functionalities");
        converterService.convert();
        return "success";
    }

}
