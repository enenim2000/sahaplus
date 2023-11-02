package com.elara.sahaplus.loan.dto.backbone;

import com.elara.sahaplus.loan.LoansResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private LoansResponseData loansResponseData;
}
