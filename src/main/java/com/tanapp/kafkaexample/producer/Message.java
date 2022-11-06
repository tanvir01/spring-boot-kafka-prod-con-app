package com.tanapp.kafkaexample.producer;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime createdAt) {
}
