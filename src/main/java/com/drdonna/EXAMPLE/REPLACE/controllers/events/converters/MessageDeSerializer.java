package com.drdonna.EXAMPLE.REPLACE.controllers.events.converters;

import com.drdonna.EXAMPLE.REPLACE.model.messages.ExampleMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class MessageDeSerializer implements Deserializer<ExampleMessage> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ExampleMessage deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, ExampleMessage.class);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}
