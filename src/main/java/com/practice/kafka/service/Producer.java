package com.practice.kafka.service;

public interface Producer {

    void sendMessage(String topic, String message);

}
