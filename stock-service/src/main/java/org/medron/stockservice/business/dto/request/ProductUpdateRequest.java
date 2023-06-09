package org.medron.stockservice.business.dto.request;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateRequest implements ProductRequest{

    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
}


