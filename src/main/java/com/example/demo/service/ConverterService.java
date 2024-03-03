package com.example.demo.service;

import com.example.demo.destination.Destination;
import com.example.demo.mapper.SourceDestinationMapper;
import com.example.demo.source.MultipleElements;
import com.example.demo.source.NameValuePair;
import com.example.demo.source.RCharacteristics;
import com.example.demo.source.Source;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ConverterService {
    
    @Autowired
    SourceDestinationMapper sourceDestinationMapper;
    public void convert() throws JsonProcessingException {

        Source source = Source.builder().id("testid").name("testname").atType("testType").build();
        List<MultipleElements> multiple = new ArrayList<>();
        for (int i=0;i<5;i++)
        {
            MultipleElements multipleElements = MultipleElements.builder().name("mn"+i).id("mi"+i).href("mh"+i).build();
            multiple.add(multipleElements);
        }
        source.setMultipleElements(multiple);
        NameValuePair n1 = NameValuePair.builder().value("v1").name("n1").valueType("vt1").build();
        NameValuePair n2 = NameValuePair.builder().value("v2").name("n2").valueType("vt2").build();
        NameValuePair n3 = NameValuePair.builder().value("v3").name("n3").valueType("vt3").build();

        RCharacteristics rcharac = RCharacteristics.builder().geocode(n1).nextcode(n2).productcode(n3).build();

        source.setCharacteristics(rcharac);

        Destination output = sourceDestinationMapper.convert(source);
        System.out.println("tried converting an object to list in the mapper response");
        System.out.println(new ObjectMapper().writeValueAsString(output));

    }
}
