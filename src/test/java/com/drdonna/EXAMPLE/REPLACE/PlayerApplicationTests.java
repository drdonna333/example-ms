package com.drdonna.EXAMPLE.REPLACE;

import com.drdonna.EXAMPLE.REPLACE.kafka.KafkaProducerForTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlayerApplicationTests {

//	@Test
//	void contextLoads() {
//	}
	@Autowired
	KafkaProducerForTest producer;
	@Autowired
	CreateGameCreatedMessage createGameCreatedMessage;
	@Test
	void contextLoads() {
		createGameCreatedMessage.setGameId("Game1");
		producer.sendMessage(createGameCreatedMessage);
	}

}
