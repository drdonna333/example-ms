package com.drdonna.EXAMPLE.REPLACE.controllers.events;

import com.drdonna.EXAMPLE.REPLACE.model.messages.ExampleMessage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(id = "my-client-application", topics = "${topic.name}")
    public void consumer(ConsumerRecord<String, ExampleMessage> consumerRecord) {
        System.out.println("Consumed Record Details: " + consumerRecord);
        ExampleMessage exampleMessage = consumerRecord.value();
        System.out.println("Consumed Message " + exampleMessage.getId());
    }
}
