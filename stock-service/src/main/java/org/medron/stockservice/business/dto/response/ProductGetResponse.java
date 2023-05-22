package org.medron.stockservice.business.dto.response;


import lombok.*;
import org.medron.stockservice.entity.Category;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductGetResponse {
    private Long id;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
    private List<Category> categoryId;
}
