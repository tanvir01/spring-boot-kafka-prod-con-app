package com.tanapp.kafkaexample.consumer;

import com.tanapp.kafkaexample.producer.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka-topic-name}", groupId = "group_id", containerFactory = "messageFactory")
    public void consume(Message message)
    {
        System.out.println("Listener Received: "+ message);
    }
}
