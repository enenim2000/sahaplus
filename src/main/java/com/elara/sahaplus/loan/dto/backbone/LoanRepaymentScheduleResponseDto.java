package com.elara.sahaplus.loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRepaymentScheduleResponseDto {
    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("PaymentDueDate")
    private String paymentDueDate;

    @JsonProperty("Principal")
    private String principal;

    @JsonProperty("Interest")
    private String interest;

    @JsonProperty("Fee")
    private String fee;

    @JsonProperty("IsPrincipalApplied")
    private boolean isPrincipalApplied;

    @JsonProperty("IsInterestApplied")
    private boolean isInterestApplied;

    @JsonProperty("IsFeeApplied")
    private boolean isFeeApplied;

    @JsonProperty("Total")
    private String total;
}
