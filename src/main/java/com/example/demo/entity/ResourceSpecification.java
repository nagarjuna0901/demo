package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.List;

@Data
@Builder
public class ResourceSpecification {

    private ObjectId specificationId;
    private boolean isPresent;
    private List<ResourceSpecCharacterisitc> resourceSpecCharacterisitcList;
    private List<ResourceSpecRelationship> resourceSpecRelationshipList;
    private List<RelatedParty> relatedPartyList;

}
