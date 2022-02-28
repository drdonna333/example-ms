package com.drdonna.EXAMPLE.REPLACE.controllers.events;

import com.drdonna.EXAMPLE.REPLACE.model.messages.ExampleMessage;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KafkaProducer {

    @Value("${topic.name}")
    private String topicName;

    private KafkaTemplate kafkaTemplate;

    public KafkaProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendExampleMessage(ExampleMessage createExampleMessage) {
        UUID key = UUID.randomUUID();
        System.out.println("Sending CreateGameCompleteMessage");

        ProducerRecord<String, ExampleMessage> record = new ProducerRecord<>(topicName,
                key.toString(),
                createExampleMessage);
        record.headers()
                .add("message-id", UUID.randomUUID()
                        .toString()
                        .getBytes());
        kafkaTemplate.send(record);
    }
}
