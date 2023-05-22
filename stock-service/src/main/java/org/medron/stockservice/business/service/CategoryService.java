package org.medron.stockservice.business.service;

import org.medron.stockservice.business.dto.request.CategoryCreateRequest;
import org.medron.stockservice.business.dto.request.CategoryUpdateRequest;
import org.medron.stockservice.business.dto.response.CategoryGetAllResponse;
import org.medron.stockservice.business.dto.response.CategoryGetResponse;
import java.util.List;

public interface CategoryService {
    void add(CategoryCreateRequest request);
    void delete(Long id);
    void update(Long id, CategoryUpdateRequest request);
    CategoryGetResponse get(Long id);
    List<CategoryGetAllResponse> getAll();
}
