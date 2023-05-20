package org.medron.stockservice.config;

import org.medron.stockservice.business.mapper.ProductMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperStructConfig {
    @Bean
    ProductMapper getProductMapper(){
        return ProductMapper.instance;
    }
}
