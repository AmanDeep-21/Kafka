package com.practice.kafka.controller;

import com.practice.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {

    @Autowired
    private Producer producer;

    // get the message and topic from postman using cURL shared in overview and send it to the producer
    @PostMapping("/v1/producerMsg")
    public ResponseEntity<String> getMessageFromPostman(@RequestParam("topic") String topic,
                                                @RequestParam("message") String message) {
        try {
            producer.sendMessage(topic, message);
            return new ResponseEntity<>("Message sent successfully to topic :: " + topic, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to send message successfully", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
