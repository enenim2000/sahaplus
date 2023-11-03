package com.elara.bankone.modules.product.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetProductResponseDto {
    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("ProductName")
    private String productName;

    @JsonProperty("ProductDiscriminator")
    private String productDiscriminator;
}
