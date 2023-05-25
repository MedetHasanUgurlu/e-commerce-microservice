package org.medron.stockservice.business.dto.request;

import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateRequest implements ProductRequest{

    private List<Long> categories;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
}
