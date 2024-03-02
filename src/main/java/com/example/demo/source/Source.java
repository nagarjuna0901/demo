package com.example.demo.source;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Source {

    private String name;
    private String id;
    private String atType;

    private List<MultipleElements> multipleElements;

    private RCharacteristics characteristics;
}
