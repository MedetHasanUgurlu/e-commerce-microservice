package org.medron.stockservice.api.imp;

import lombok.RequiredArgsConstructor;
import org.medron.stockservice.api.CategoryController;
import org.medron.stockservice.business.dto.request.CategoryCreateRequest;
import org.medron.stockservice.business.dto.request.CategoryUpdateRequest;
import org.medron.stockservice.business.dto.response.CategoryGetAllResponse;
import org.medron.stockservice.business.dto.response.CategoryGetResponse;
import org.medron.stockservice.business.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryControllerImp implements CategoryController {
    private final CategoryService service;
    @Override
    @PostMapping
    public ResponseEntity<Void> add(@RequestBody CategoryCreateRequest request) {
        service.add(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> update(Long id, CategoryUpdateRequest request) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<CategoryGetAllResponse>> getAll() {
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CategoryGetResponse> get(Long id) {
        return null;
    }
}
