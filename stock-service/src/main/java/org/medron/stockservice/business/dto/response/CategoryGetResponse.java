package org.medron.stockservice.business.dto.response;


import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryGetResponse {
    private Long id;
    private String name;
    private List<Long> products;


}
