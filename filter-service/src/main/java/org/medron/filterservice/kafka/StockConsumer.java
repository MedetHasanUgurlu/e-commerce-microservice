package org.medron.filterservice.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.medron.commonservice.kafka.event.stock.ProductCreateEvent;
import org.medron.commonservice.kafka.event.stock.ProductDeleteEvent;
import org.medron.commonservice.kafka.event.stock.ProductUpdateEvent;
import org.medron.filterservice.business.service.FilterService;
import org.medron.filterservice.entity.Filter;
import org.medron.filterservice.repository.FilterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockConsumer {
    private final FilterService service;
    private final ModelMapper mapper;
    private final FilterRepository repository;

    @KafkaListener(topics = "topic-product-create",groupId = "gpId-product-create-1")
    public void consume(ProductCreateEvent event){
        Filter filter = mapper.map(event,Filter.class);
        filter.setId(UUID.randomUUID().toString());
        service.add(filter);
        log.info("<==== TOPIC-PRODUCT-CREATE ====>");
    }
    @KafkaListener(topics = "topic-product-update",groupId = "gpId-product-update-1")
    public void consume(ProductUpdateEvent event){
        Filter filter = repository.findByProductId(event.getProductId()).orElseThrow();
        filter.setName(event.getName());
        filter.setDescription(event.getDescription());
        filter.setStockQuantity(event.getStockQuantity());
        filter.setUnitPrice(event.getUnitPrice());
        service.add(filter);
        log.info("<==== TOPIC-PRODUCT-UPDATE ====>");

    }
    @KafkaListener(topics = "topic-product-delete",groupId = "gpId-topic-product-delete-1")
    public void consume(ProductDeleteEvent event){
        service.removeProduct(event.getProductId());
        log.info("<==== TOPIC-PRODUCT-DELETE ====>");
    }

}
