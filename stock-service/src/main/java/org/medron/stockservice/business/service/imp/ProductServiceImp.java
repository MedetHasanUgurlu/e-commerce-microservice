package org.medron.stockservice.business.service.imp;

import lombok.RequiredArgsConstructor;
import org.medron.stockservice.business.dto.request.ProductCreateRequest;
import org.medron.stockservice.business.dto.request.ProductRequest;
import org.medron.stockservice.business.dto.request.ProductUpdateRequest;
import org.medron.stockservice.business.dto.response.ProductGetAllResponse;
import org.medron.stockservice.business.dto.response.ProductGetResponse;
import org.medron.stockservice.business.service.ProductService;
import org.medron.stockservice.entity.Category;
import org.medron.stockservice.entity.Product;
import org.medron.stockservice.repository.CategoryRepository;
import org.medron.stockservice.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {
    private final ProductRepository repository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper mapper;

    Product requestToEntity(ProductRequest request){
        return mapper.map(request,Product.class);
    }
    ProductGetResponse entityToGetResponse(Product product){
        return mapper.map(product,ProductGetResponse.class);
    }
    ProductGetAllResponse entityToGetAllResponse(Product product){
        return mapper.map(product,ProductGetAllResponse.class);
    }
    @Override
    public void add(ProductCreateRequest request) {
        Product product = requestToEntity(request);
        List<Category> categories = categoryRepository.findAllById(request.getCategories());
        product.setCategories(categories);
        product.setId(0L);
        repository.save(product);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, ProductUpdateRequest request) {

    }

    @Override
    public ProductGetResponse get(Long id) {
        return null;
    }

    @Override
    public List<ProductGetAllResponse> getAll() {
        return repository.findAll().stream().map(this::entityToGetAllResponse).toList();
    }
}
