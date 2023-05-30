package org.medron.filterservice.business.service;

import lombok.RequiredArgsConstructor;
import org.medron.filterservice.business.dto.FilterGetAllResponse;
import org.medron.filterservice.business.dto.FilterGetResponse;
import org.medron.filterservice.business.rules.FilterBusinessRule;
import org.medron.filterservice.entity.Filter;
import org.medron.filterservice.repository.FilterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FilterServiceImp implements FilterService{
    private final FilterRepository repository;
    private final FilterBusinessRule rule;
    @Override
    public void add(Filter filter) {
        rule.checkProductExist(filter.getProductId());
        repository.save(filter);
    }

    @Override
    public List<FilterGetAllResponse> getAll() {
        return null;
    }

    @Override
    public List<FilterGetResponse> get(String id) {
        return null;
    }

    @Override
    public void removeAllCategoryName(String categoryName) {

    }

    @Override
    public void removeProduct(String productName) {

    }

    @Override
    public void removeFilter(String id) {

    }
}
