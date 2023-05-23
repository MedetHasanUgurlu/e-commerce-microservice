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
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id,@RequestBody CategoryUpdateRequest request) {
        service.update(id,request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<CategoryGetAllResponse>> getAll() {
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<CategoryGetResponse> get(@PathVariable Long id) {
        return new ResponseEntity<>(service.get(id),HttpStatus.OK);
    }
}
