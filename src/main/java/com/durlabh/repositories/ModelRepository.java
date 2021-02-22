package com.durlabh.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.durlabh.document.Model;

public interface ModelRepository extends MongoRepository<Model, String> {

}
