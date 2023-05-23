package org.medron.stockservice.business.rule;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.medron.commonservice.exception.BusinessException;
import org.medron.stockservice.constant.ExceptionMessage;
import org.medron.stockservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryBusinessRule {
    private final CategoryRepository repository;

    public void checkEntityExist(Long id){
        if(repository.findById(id).isEmpty()){
            throw new BusinessException(ExceptionMessage.Category.ENTITY_NOT_EXIST);
        }
    }
    public void checkName(String name){
        if(repository.existsByNameIgnoreCase(name)){
            throw new BusinessException(ExceptionMessage.Category.NAME_ALREADY_EXIST);
        }
    }

}
