package org.medron.stockservice.business.dto.request;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateRequest implements ProductRequest{
    private UUID categoryId;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
}
