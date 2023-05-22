package org.medron.stockservice.business.dto.response;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryGetAllResponse {
    private Long id;
    private String name;
}
