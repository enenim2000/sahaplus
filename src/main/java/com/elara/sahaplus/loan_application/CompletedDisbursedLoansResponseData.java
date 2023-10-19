package com.elara.sahaplus.loan_application;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompletedDisbursedLoansResponseData {
    @JsonProperty("TotalDisbursedLoanCount")
    private long totalDisbursedLoanCount;

    @JsonProperty("TotalDisbursedAmountInNaira")
    private String totalDisbursedAmountInNaira;
}

