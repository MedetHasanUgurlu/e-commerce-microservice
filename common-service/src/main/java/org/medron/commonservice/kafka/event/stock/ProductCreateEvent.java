package org.medron.commonservice.kafka.event.stock;

import lombok.*;
import org.medron.commonservice.kafka.event.BaseEvent;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateEvent implements BaseEvent {
    private String productId;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
    private List<String> categoriesName;

}
