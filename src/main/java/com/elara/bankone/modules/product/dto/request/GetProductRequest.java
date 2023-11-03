package com.elara.bankone.modules.product.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetProductRequest {
    private String mfbCode;
}
