package com.tanapp.kafkaexample.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${kafka-topic-name}")
    private String kafkaTopicName;

    @Bean
    public NewTopic tanappTopic() {
        return TopicBuilder.name(kafkaTopicName).build();
    }

    public String getKafkaTopicName() {
        return kafkaTopicName;
    }
}
