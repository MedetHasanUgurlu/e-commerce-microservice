package org.medron.commonservice.config;

import org.medron.commonservice.kafka.KafkaProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public KafkaProducer getKafkaProducer(KafkaTemplate<String,Object> kafkaTemplate){
        return new KafkaProducer(kafkaTemplate);
    }

}
