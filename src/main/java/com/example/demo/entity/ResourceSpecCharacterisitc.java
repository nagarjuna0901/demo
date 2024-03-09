package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResourceSpecCharacterisitc {
    private String name;
    private String description;
    private String maxCardinality;
    private String minCardinality;
    private List<ResourceSpecCharacterisitcValue> resourceSpecCharacterisitcValueList;

}
