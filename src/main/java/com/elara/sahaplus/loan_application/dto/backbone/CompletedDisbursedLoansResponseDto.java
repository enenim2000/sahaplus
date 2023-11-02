package com.elara.sahaplus.loan_application.dto.backbone;

import com.elara.sahaplus.loan_application.CompletedDisbursedLoansResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompletedDisbursedLoansResponseDto {

    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private CompletedDisbursedLoansResponseData completedDisbursedLoansResponseData;
}
