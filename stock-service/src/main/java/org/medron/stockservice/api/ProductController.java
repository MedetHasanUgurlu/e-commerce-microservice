package org.medron.stockservice.api;

import org.medron.stockservice.business.dto.request.ProductCreateRequest;
import org.medron.stockservice.business.dto.request.ProductUpdateRequest;
import org.medron.stockservice.business.dto.response.ProductGetAllResponse;
import org.medron.stockservice.business.dto.response.ProductGetResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ProductController {
    ResponseEntity<Void> add(ProductCreateRequest request);
    ResponseEntity<Void> delete(UUID id);
    ResponseEntity<Void> update(UUID id, ProductUpdateRequest request);
    ResponseEntity<List<ProductGetAllResponse>> getAll();
    ResponseEntity<ProductGetResponse> get(UUID id);
}
