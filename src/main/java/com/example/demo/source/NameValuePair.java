package com.example.demo.source;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NameValuePair {

    private String name;
    private String value;
    private String valueType;
}
