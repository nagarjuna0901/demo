package com.example.demo.destination;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ROCharacteristics {
    private String name;
    private String value;
    private String valueType;


}
