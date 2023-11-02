package com.elara.sahaplus.loan.dto.backbone;

import com.elara.sahaplus.loan.ProfitabilityParInformationData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfitabilityParInformationResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private ProfitabilityParInformationData profitabilityParInformationData;
}
