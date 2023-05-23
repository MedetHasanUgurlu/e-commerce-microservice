package org.medron.stockservice.business.rule;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.medron.commonservice.exception.BusinessException;
import org.medron.stockservice.constant.ExceptionMessage;
import org.medron.stockservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductBusinessRule {
    private final ProductRepository repository;
    public void checkEntityExist(Long id){
        if(repository.findById(id).isEmpty()){
            throw new BusinessException(ExceptionMessage.Product.ENTITY_NOT_EXIST);
        }
    }
    public void checkName(String name){
        if(repository.existsByNameIgnoreCase(name)){
            throw new BusinessException(ExceptionMessage.Product.NAME_ALREADY_EXIST);
        }
    }
}

