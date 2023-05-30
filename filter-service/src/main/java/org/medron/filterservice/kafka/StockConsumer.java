package org.medron.filterservice.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.medron.filterservice.business.service.FilterService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockConsumer {
    private final FilterService service;

}
