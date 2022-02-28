package com.drdonna.EXAMPLE.REPLACE.gateway.services;

import com.drdonna.EXAMPLE.REPLACE.controllers.events.KafkaProducer;
import com.drdonna.EXAMPLE.REPLACE.model.messages.ExampleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishExampleGwService {

    @Autowired
    ExampleMessage exampleMessage;

    @Autowired
    KafkaProducer kafkaProducer;

    public void publish(List<String> playersIds, String gameId)
    {
        exampleMessage.setPlayerIds(playersIds);
        exampleMessage.setGameId(gameId);

        kafkaProducer.sendExampleMessage(exampleMessage);
    }
}
