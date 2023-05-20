package org.medron.stockservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;


    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Category> categories;

}
