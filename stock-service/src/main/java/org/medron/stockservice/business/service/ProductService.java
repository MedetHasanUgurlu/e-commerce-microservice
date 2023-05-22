package org.medron.stockservice.business.service;

import org.medron.stockservice.business.dto.request.ProductCreateRequest;
import org.medron.stockservice.business.dto.request.ProductUpdateRequest;
import org.medron.stockservice.business.dto.response.ProductGetAllResponse;
import org.medron.stockservice.business.dto.response.ProductGetResponse;

import java.util.List;

public interface ProductService {
    void add(ProductCreateRequest request);
    void delete(Long id);
    void update(Long id, ProductUpdateRequest request);
    ProductGetResponse get(Long id);
    List<ProductGetAllResponse> getAll();
}
