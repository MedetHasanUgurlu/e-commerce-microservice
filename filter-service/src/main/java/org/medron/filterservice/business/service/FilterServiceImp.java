package org.medron.filterservice.business.service;

import lombok.RequiredArgsConstructor;
import org.medron.filterservice.business.dto.FilterGetAllResponse;
import org.medron.filterservice.business.dto.FilterGetResponse;
import org.medron.filterservice.business.rules.FilterBusinessRule;
import org.medron.filterservice.entity.Filter;
import org.medron.filterservice.repository.FilterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FilterServiceImp implements FilterService{
    private final FilterRepository repository;
    private final FilterBusinessRule rule;
    private final ModelMapper mapper;
    @Override
    public void add(Filter filter) {
        rule.checkProductExist(filter.getProductId());
        repository.save(filter);
    }

    @Override
    public List<FilterGetAllResponse> getAll() {
        return repository.findAll().stream().map(filter -> mapper.map(filter, FilterGetAllResponse.class)).toList();
    }

    @Override
    public FilterGetResponse get(String id) {
        return mapper.map(repository.findById(id).orElseThrow(), FilterGetResponse.class);
    }

    @Override
    public void removeAllCategoryName(String categoryName) {
        repository.deleteAllByCategoriesNameContainsIgnoreCase(categoryName);
    }

    @Override
    public void removeProduct(String productId) {
        repository.deleteFilterByProductId(productId);
    }

    @Override
    public void removeFilter(String id) {
        repository.deleteById(id);
    }
}
