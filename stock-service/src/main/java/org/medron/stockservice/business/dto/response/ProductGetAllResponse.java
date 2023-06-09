package org.medron.stockservice.business.dto.response;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductGetAllResponse {
    private Long id;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
    private List<String> categoriesName;
}
