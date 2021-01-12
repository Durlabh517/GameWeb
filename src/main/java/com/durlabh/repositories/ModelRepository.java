package com.durlabh.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.durlabh.document.Model;

public interface ModelRepository extends MongoRepository<Model, Long> {

}
