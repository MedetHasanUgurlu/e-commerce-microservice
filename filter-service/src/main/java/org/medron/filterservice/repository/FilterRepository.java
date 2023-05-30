package org.medron.filterservice.repository;

import org.medron.filterservice.entity.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepository extends MongoRepository<Filter,String> {
    boolean existsByProductId(String productId);
}
