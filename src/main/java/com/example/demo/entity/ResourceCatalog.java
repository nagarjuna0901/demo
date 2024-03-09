package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Document(value = "resourceCatalog")
public class ResourceCatalog {
    @Id
    private ObjectId catalogIdGen;
    private String name;
    private String description;
    private String lifeCycleStatus;
    private int version;
    private Date catalogStartTime;
    private Date catalofEndTime;
    private ObjectId categoryIdGen;
    private ObjectId resourecCatalogIdGen;
    private String categoryName;
    private List<ResourceCandidate> resourceCandidateList;

}
