package org.medron.stockservice.business.service;

import lombok.RequiredArgsConstructor;
import org.medron.commonservice.kafka.KafkaProducer;
import org.medron.commonservice.kafka.event.stock.ProductCreateEvent;
import org.medron.stockservice.business.dto.request.ProductCreateRequest;
import org.medron.stockservice.business.dto.request.ProductRequest;
import org.medron.stockservice.business.dto.request.ProductUpdateRequest;
import org.medron.stockservice.business.dto.response.ProductGetAllResponse;
import org.medron.stockservice.business.dto.response.ProductGetResponse;
import org.medron.stockservice.business.rule.ProductBusinessRule;
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
    private final ProductBusinessRule rule;
    private final KafkaProducer kafkaProducer;

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
        productCreateSendKafka(product);
    }

    @Override
    public void delete(Long id) {
        rule.checkEntityExist(id);
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, ProductUpdateRequest request) {
        rule.checkEntityExist(id);
        rule.checkName(request.getName());
        Product product = requestToEntity(request);
        product.setId(id);
        repository.save(product);
    }

    @Override
    public ProductGetResponse get(Long id) {
        rule.checkEntityExist(id);
        ProductGetResponse response = entityToGetResponse(repository.findById(id).orElseThrow());
        response.setCategoryId(repository.findById(id).orElseThrow().getCategories());
        return response;
    }

    @Override
    public List<ProductGetAllResponse> getAll() {
        return repository.findAll().stream().map(product -> {
           ProductGetAllResponse response = entityToGetAllResponse(product);
           response.setCategoriesName(product.getCategories().stream().map(Category::getName).toList());
           return response;
        }).toList();
    }


    private void productCreateSendKafka(Product product){
        ProductCreateEvent event = mapper.map(product,ProductCreateEvent.class);
        event.setProductId(product.getId().toString());
        event.setCategoriesName(product.getCategories().stream().map(Category::getName).toList());
        kafkaProducer.send(event,"topic-product-create");
    }
    private void productUpdateSendKafka(Product product){

    }
}
