package com.drdonna.EXAMPLE.REPLACE.repository.impl;

import com.drdonna.EXAMPLE.REPLACE.model.Example;
import com.drdonna.EXAMPLE.REPLACE.repository.interfaces.ICommonRepository;
import com.drdonna.EXAMPLE.REPLACE.repository.interfaces.mongo.IExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonRepository implements ICommonRepository {


    @Autowired
    private IExampleRepository playerRepositoryMongo;

    @Override
    public Example getExampleById(String id) {
        return playerRepositoryMongo.findById(id).orElse(null);
    }

    @Override
    public Example createExample(Example player) {
        return playerRepositoryMongo.save(player);
    }

    @Override
    public void updateExample(Example player) {
        playerRepositoryMongo.save(player);
    }


}
