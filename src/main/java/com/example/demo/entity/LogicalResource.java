package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "logicalResources")
public class LogicalResource {

    @Id
    private String id;
    private String name;
    private String resourceStatus;
    private ObjectId specId;
}
