package com.Kaiburr.Task1.Repository;

import com.Kaiburr.Task1.Model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServerRepository extends MongoRepository<Server,String> {
    Server findAllByID(String ID);

    void deleteByID(String ID);

    List<Server> findBynameContainingIgnoreCase(String text);
}
