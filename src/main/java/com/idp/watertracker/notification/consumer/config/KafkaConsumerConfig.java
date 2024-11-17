//package com.idp.watertracker.notification.consumer.config;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class KafkaConsumerConfig {
//
//    @Bean
//    public ConsumerFactory<String, String> consumerFactory() {
//        Map<String, Object> configProps = new HashMap<>();
//
//        // Kafka broker address
//        configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//
//        // Consumer group ID
//        configProps.put(ConsumerConfig.GROUP_ID_CONFIG, "my-consumer-group");
//
//        // Key and Value Deserializers
//        configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//
//        // Additional consumer configurations
//        configProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest"); // Start reading from the beginning of the topic
//        configProps.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false); // Disable auto-commit for manual control
//
//        // Consumer acks and timeout configuration
//        configProps.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 300000); // Maximum time between polls (5 minutes)
//        configProps.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 10000); // Session timeout (10 seconds)
//
//        return new DefaultKafkaConsumerFactory<>(configProps);
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        factory.setConcurrency(3); // Optional: Number of concurrent consumers in the group
//
//        return factory;
//    }
//}
