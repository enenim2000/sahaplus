package com.elara.bankone.modules.loan_application;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompletedLoanRepaymentResponseData {
    @JsonProperty("TotalRepaidLoanCount")
    private long totalRepaidLoanCount;

    @JsonProperty("TotalRepaidLoanAmountInNaira")
    private long totalRepaidLoanAmountInNaira;

}
