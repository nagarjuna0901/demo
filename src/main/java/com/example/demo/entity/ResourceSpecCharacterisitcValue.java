package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceSpecCharacterisitcValue {
    private String value;
    private String valueType;
}
