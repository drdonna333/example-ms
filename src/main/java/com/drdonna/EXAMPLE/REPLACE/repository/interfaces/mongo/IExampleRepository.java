package com.drdonna.EXAMPLE.REPLACE.repository.interfaces.mongo;

import com.drdonna.EXAMPLE.REPLACE.model.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExampleRepository extends MongoRepository<Example, String> {

}
