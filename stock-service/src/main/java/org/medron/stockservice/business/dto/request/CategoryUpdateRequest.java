package org.medron.stockservice.business.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUpdateRequest implements CategoryRequest{
    private String name;
}
