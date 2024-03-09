package com.example.demo.controller;

import com.example.demo.dto.LRR;
import com.example.demo.service.ConverterService;
import com.example.demo.service.UpdateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @Autowired
    ConverterService converterService;
    @Autowired
    UpdateService updateService;

    @PostMapping("/post")
    public Mono<LRR> fetchData(@RequestBody Mono<LRR> lrrMono) throws JsonProcessingException {

        return updateService.update(lrrMono);

    }

}
