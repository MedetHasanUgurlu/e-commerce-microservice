package org.medron.commonservice.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private final KafkaTemplate<String,Object> kafkaTemplate;
    public <T extends BaseEvent> void send(T data, String topicName){
        Message<T> message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC,topicName).build();
        kafkaTemplate.send(message);
        log.error("[Data]: "+data.toString()+"[TopicName]: "+topicName);

    }
}
