package org.medron.filterservice.business.service;

import org.medron.filterservice.business.dto.FilterGetAllResponse;
import org.medron.filterservice.business.dto.FilterGetResponse;
import org.medron.filterservice.entity.Filter;
import java.util.List;
public interface FilterService {
    void add(Filter filter);
    List<FilterGetAllResponse> getAll();
    List<FilterGetResponse> get(String id);
    void removeAllCategoryName(String categoryName);
    void removeProduct(String productName);
    void removeFilter(String id);
}
