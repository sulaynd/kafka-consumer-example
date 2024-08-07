package com.javatechie.consumer;

import com.javatechie.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListener {

   // Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

//    @KafkaListener(topics = "louly-topic",groupId = "ls-group")
//    public void consumeEvents(Customer customer) {
//        log.info("consumer consume the events {} ", customer.toString());
//    }

    @KafkaListener(topics = "louly-topic-demo-1",groupId = "jt-group-2")
    public void consume_1(String message) {
        log.info("consumer_1 consume the message {} ", message);
    }

    @KafkaListener(topics = "louly-topic-demo-1",groupId = "jt-group-2")
    public void consume_2(String message) {
        log.info("consumer_2 consume the message {} ", message);
    }

    @KafkaListener(topics = "louly-topic-demo-1",groupId = "jt-group-2")
    public void consume_3(String message) {
        log.info("consumer_3 consume the message {} ", message);
    }

    @KafkaListener(topics = "louly-topic-demo-1",groupId = "jt-group-2")
    public void consume_4(String message) {
        log.info("consumer_4 consume the message {} ", message);
    }
}
