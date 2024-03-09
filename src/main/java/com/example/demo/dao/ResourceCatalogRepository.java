package com.example.demo.dao;


import com.example.demo.entity.ResourceCatalog;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.rmi.server.ObjID;

public interface ResourceCatalogRepository extends ReactiveCrudRepository<ResourceCatalog, ObjectId> {
}
