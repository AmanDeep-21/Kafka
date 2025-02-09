package com.practice.kafka.serviceImpl;

import com.practice.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer implements Producer {

    /**
     * KafkaTemplate<K, V>
     * K -> type of topic, V -> type of message
     */
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("message " + message);
    }

}
