package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;

@Data
@Builder
public class ConfigurationSpecification {
    private ObjectId configId;
    private List<ConfigurationCharacteristic> configurationCharacteristicList;
}
