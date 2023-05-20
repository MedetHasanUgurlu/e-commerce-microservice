package org.medron.stockservice.api.imp;

import lombok.RequiredArgsConstructor;
import org.medron.stockservice.api.CategoryController;
import org.medron.stockservice.business.dto.request.CategoryCreateRequest;
import org.medron.stockservice.business.dto.request.CategoryUpdateRequest;
import org.medron.stockservice.business.dto.response.CategoryGetAllResponse;
import org.medron.stockservice.business.dto.response.CategoryGetResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class CategoryControllerImp implements CategoryController {
    @Override
    public ResponseEntity<Void> add(CategoryCreateRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> update(UUID id, CategoryUpdateRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<List<CategoryGetAllResponse>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<CategoryGetResponse> get(UUID id) {
        return null;
    }
}
