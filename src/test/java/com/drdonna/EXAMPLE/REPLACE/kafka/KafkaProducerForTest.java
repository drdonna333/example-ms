package com.drdonna.EXAMPLE.REPLACE.kafka;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KafkaProducerForTest {

    @Value("${topic.name}")
    private String topicName;

    private KafkaTemplate kafkaTemplate;

    public KafkaProducerForTest(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(CreateGameCreatedMessage createGameCreatedMessage) {
        UUID key = UUID.randomUUID();
        ProducerRecord<String, CreateGameCreatedMessage> record = new ProducerRecord<>(topicName,
                key.toString(),
                createGameCreatedMessage);
        record.headers()
                .add("message-id", UUID.randomUUID()
                        .toString()
                        .getBytes());
        kafkaTemplate.send(record);
    }
}
