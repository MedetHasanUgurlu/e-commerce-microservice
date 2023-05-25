package org.medron.stockservice.business.service.imp;

import lombok.RequiredArgsConstructor;
import org.medron.stockservice.business.dto.request.CategoryCreateRequest;
import org.medron.stockservice.business.dto.request.CategoryRequest;
import org.medron.stockservice.business.dto.request.CategoryUpdateRequest;
import org.medron.stockservice.business.dto.response.CategoryGetAllResponse;
import org.medron.stockservice.business.dto.response.CategoryGetResponse;
import org.medron.stockservice.business.rule.CategoryBusinessRule;
import org.medron.stockservice.business.service.CategoryService;
import org.medron.stockservice.entity.Category;
import org.medron.stockservice.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService {
    private final CategoryRepository repository;
    private final CategoryBusinessRule rule;
    private final ModelMapper mapper;

    public Category requestToEntity(CategoryRequest request){
        return mapper.map(request,Category.class);
    }
    public CategoryGetResponse entityToGetResponse(Category category){
        return mapper.map(category,CategoryGetResponse.class);
    }
    public CategoryGetAllResponse entityToGetAllResponse(Category category){
        return mapper.map(category,CategoryGetAllResponse.class);

    }
    @Override
    public void add(CategoryCreateRequest request) {
        rule.checkName(request.getName());
        Category category = requestToEntity(request);
        category.setId(0L);
        repository.save(category);
    }

    @Override
    public void delete(Long id) {
        rule.checkEntityExist(id);
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, CategoryUpdateRequest request) {
        rule.checkEntityExist(id);
        Category category = repository.findById(id).orElseThrow();
        category.setName(request.getName());
        repository.save(category);
    }

    @Override
    public CategoryGetResponse get(Long id) {
        return entityToGetResponse(repository.findById(id).orElseThrow());
    }

    @Override
    public List<CategoryGetAllResponse> getAll() {
        return repository.findAll().stream().map(this::entityToGetAllResponse).toList();
    }

}
