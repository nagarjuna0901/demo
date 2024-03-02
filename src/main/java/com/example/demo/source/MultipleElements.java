package com.example.demo.source;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MultipleElements {
    private String name;
    private String id;
    private String href;
}
