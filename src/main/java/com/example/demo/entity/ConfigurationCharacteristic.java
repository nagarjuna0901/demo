package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConfigurationCharacteristic {

    private String name;
    private String value;
}
