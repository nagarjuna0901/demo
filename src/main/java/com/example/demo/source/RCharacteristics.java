package com.example.demo.source;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RCharacteristics {

    private NameValuePair productcode;
    private NameValuePair geocode;
    private NameValuePair nextcode;
}
