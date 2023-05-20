package org.medron.stockservice.business.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.medron.stockservice.business.dto.request.ProductRequest;
import org.medron.stockservice.business.dto.response.ProductGetResponse;
import org.medron.stockservice.entity.Product;

@Mapper
public interface ProductMapper {
    ProductMapper instance = Mappers.getMapper(ProductMapper.class);

    Product requestToEntity(ProductRequest request);
    ProductGetResponse entityToResponse(Product product);

}
