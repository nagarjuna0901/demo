package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class ResourceSpecRelationship {
    private ObjectId id;
    private String relationshipType;
}
