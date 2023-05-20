package org.medron.stockservice.api.imp;

import lombok.RequiredArgsConstructor;
import org.medron.stockservice.api.ProductController;
import org.medron.stockservice.business.dto.request.ProductCreateRequest;
import org.medron.stockservice.business.dto.request.ProductUpdateRequest;
import org.medron.stockservice.business.dto.response.ProductGetAllResponse;
import org.medron.stockservice.business.dto.response.ProductGetResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ProductControllerImp implements ProductController {
    @Override
    public ResponseEntity<Void> add(ProductCreateRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> update(UUID id, ProductUpdateRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<List<ProductGetAllResponse>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<ProductGetResponse> get(UUID id) {
        return null;
    }
}
