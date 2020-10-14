package com.isban.gcb.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private static final String TOPIC =""


    @KafkaListener(topics = TOPIC)
    private void listen(String msg) {
        System.out.println("El mensaje enviado es: " + msg);
    }
}
