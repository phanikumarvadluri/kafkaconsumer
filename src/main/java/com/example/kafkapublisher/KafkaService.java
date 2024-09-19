package com.example.kafkapublisher;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {



    @KafkaListener(topics = "sai-topic",groupId = "sai-consumer-1")
    public void getMessage(String message){
        System.out.println(message);
    }
}
