package com.example.demo.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LRR {

    private String requestId;
    private List<LRRI> lrris;

}
