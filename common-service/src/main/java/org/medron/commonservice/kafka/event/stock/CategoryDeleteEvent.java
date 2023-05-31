package org.medron.commonservice.kafka.event.stock;

import lombok.*;
import org.medron.commonservice.kafka.event.BaseEvent;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDeleteEvent implements BaseEvent {
    private String categoryId;

}
