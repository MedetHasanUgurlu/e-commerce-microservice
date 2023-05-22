package org.medron.stockservice.api;

import org.medron.stockservice.business.dto.request.CategoryCreateRequest;
import org.medron.stockservice.business.dto.request.CategoryUpdateRequest;
import org.medron.stockservice.business.dto.request.ProductCreateRequest;
import org.medron.stockservice.business.dto.request.ProductUpdateRequest;
import org.medron.stockservice.business.dto.response.CategoryGetAllResponse;
import org.medron.stockservice.business.dto.response.CategoryGetResponse;
import org.medron.stockservice.business.dto.response.ProductGetAllResponse;
import org.medron.stockservice.business.dto.response.ProductGetResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface CategoryController {
    ResponseEntity<Void> add(CategoryCreateRequest request);
    ResponseEntity<Void> delete(Long id);
    ResponseEntity<Void> update(Long id, CategoryUpdateRequest request);
    ResponseEntity<List<CategoryGetAllResponse>> getAll();
    ResponseEntity<CategoryGetResponse> get(Long id);
}
