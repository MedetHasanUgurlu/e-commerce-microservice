package org.medron.filterservice.api;

import org.medron.filterservice.business.dto.FilterGetAllResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FilterController {
    ResponseEntity<Void> delete(String id);
    ResponseEntity<List<FilterGetAllResponse>> getAll();

}
