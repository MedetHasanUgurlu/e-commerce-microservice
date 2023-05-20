package org.medron.stockservice.business.rule;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.medron.stockservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryBusinessRule {
    private final CategoryRepository repository;
}
