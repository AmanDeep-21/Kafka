package com.practice.kafka.serviceImpl;

import com.practice.kafka.service.Consumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer implements Consumer {

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    @Override
    public void listenToTopic(String message) {
        System.out.println("The message received is " + message);
    }
}
