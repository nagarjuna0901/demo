package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class ResourceCandidate {
    private ObjectId candidateIdGen;
    private String name;
    private String description;

    private ResourceSpecification resourceSpecification;
    private ConfigurationSpecification configurationSpecification;

}
