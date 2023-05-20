package org.medron.stockservice.business.dto.response;


import lombok.*;
import org.medron.stockservice.entity.Product;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryGetResponse {
    private UUID id;
    private String name;
    private Set<Product> products;

}
