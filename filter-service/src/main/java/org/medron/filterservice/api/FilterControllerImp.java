package org.medron.filterservice.api;

import lombok.RequiredArgsConstructor;
import org.medron.filterservice.business.dto.FilterGetAllResponse;
import org.medron.filterservice.business.service.FilterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/filter")
public class FilterControllerImp implements FilterController{
    private final FilterService service;
    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.removeFilter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<FilterGetAllResponse>> getAll() {
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
}
