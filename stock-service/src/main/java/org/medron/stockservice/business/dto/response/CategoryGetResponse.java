package org.medron.stockservice.business.dto.response;


import lombok.*;
import org.medron.stockservice.entity.Product;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryGetResponse {
    private Long id;
    private String name;
    private List<Product> products;

}
