package org.medron.stockservice.business.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryCreateRequest implements CategoryRequest {
    private String name;

}
