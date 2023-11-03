package com.elara.bankone.modules.loan_application;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovedLoansResponseData {
    @JsonProperty("TotalApprovedLoanCount")
    private long totalApprovedLoanCount;

    @JsonProperty("TotalApprovedLoanAmountInNaira")
    private String totalApprovedLoanAmountInNaira;
}
