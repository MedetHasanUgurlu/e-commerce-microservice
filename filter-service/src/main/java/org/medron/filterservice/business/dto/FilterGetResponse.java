package org.medron.filterservice.business.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterGetResponse {
    private String id;
    private String productId;
    private String categoryId;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
    private List<String> categoriesName;
}
