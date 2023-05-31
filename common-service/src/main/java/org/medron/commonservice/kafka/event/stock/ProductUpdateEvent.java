package org.medron.commonservice.kafka.event.stock;

import lombok.*;
import org.medron.commonservice.kafka.event.BaseEvent;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateEvent implements BaseEvent {
    private String productId;
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private boolean status;
    private String description;
}
