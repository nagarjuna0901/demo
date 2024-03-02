package com.example.demo.destination;

import lombok.Data;

import java.util.List;

@Data
public class Destination {
    private String name;
    private String value;
    private String atType;

    private List<RMultipleItems> rMultipleItemsList;

    private List<ROCharacteristics> roCharacteristicsList;
}
