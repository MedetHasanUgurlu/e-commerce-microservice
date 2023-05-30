package org.medron.filterservice.business.rules;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.medron.commonservice.exception.BusinessException;
import org.medron.filterservice.constant.ExceptionMessage;
import org.medron.filterservice.repository.FilterRepository;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class FilterBusinessRule {
    private final FilterRepository repository;
    public void checkEntityExist(String id){
        if(!repository.existsById(id)){
            log.info("<==== ENTITY_NOT_EXIST ====>");
            throw new BusinessException(ExceptionMessage.ENTITY_NOT_EXIST);
        }
    }
    public void checkProductExist(String productId){
        if(repository.existsByProductId(productId)){
            log.info("<==== PRODUCT_ALREADY_EXIST ====>");

            throw new BusinessException(ExceptionMessage.PRODUCT_ALREADY_EXIST);
        }
    }


}
