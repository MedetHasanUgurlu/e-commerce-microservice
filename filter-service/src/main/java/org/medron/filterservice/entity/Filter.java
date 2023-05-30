package org.medron.filterservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Filter {
    @Id
    private String id;
    private String productId;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
    private List<String> categoriesName;

}
