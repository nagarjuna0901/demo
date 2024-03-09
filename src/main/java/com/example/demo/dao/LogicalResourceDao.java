package com.example.demo.dao;

import com.example.demo.entity.LogicalResource;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface LogicalResourceDao extends ReactiveCrudRepository<LogicalResource,String> {
}
