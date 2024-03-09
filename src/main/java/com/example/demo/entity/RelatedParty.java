package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class RelatedParty {
    private ObjectId id;
    private String name;
    private String role;
}
