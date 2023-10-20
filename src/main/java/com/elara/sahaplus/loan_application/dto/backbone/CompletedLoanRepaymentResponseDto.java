package com.elara.sahaplus.loan_application.dto.backbone;

import com.elara.sahaplus.loan_application.CompletedLoanRepaymentResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompletedLoanRepaymentResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private CompletedLoanRepaymentResponseData completedLoanRepaymentData;
}
