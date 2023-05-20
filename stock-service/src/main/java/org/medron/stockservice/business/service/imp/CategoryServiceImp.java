package org.medron.stockservice.business.service.imp;

import lombok.RequiredArgsConstructor;
import org.medron.stockservice.business.rule.CategoryBusinessRule;
import org.medron.stockservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp {
    private final CategoryRepository repository;
    private final CategoryBusinessRule rule;

}
