package com.drdonna.EXAMPLE.REPLACE.services;

import com.drdonna.EXAMPLE.REPLACE.db.services.ExampleDbService;
import com.drdonna.EXAMPLE.REPLACE.model.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Autowired
    ExampleDbService createPlayerDbService;

    public org.springframework.data.domain.Example execute(Example player)
    {
        return null;
    }
}
