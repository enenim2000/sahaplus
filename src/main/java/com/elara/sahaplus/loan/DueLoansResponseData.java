package com.elara.sahaplus.loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DueLoansResponseData {
    private long totalCount;
    private BigDecimal totalLoanAmount;
    private BigDecimal totalDuePrincipal;
    private BigDecimal totalDueInterest;
    private BigDecimal totalFeesDue;

    @JsonProperty("totalOutstandingprincipal")
    private BigDecimal totalOutstandingPrincipal;

    @JsonProperty("totalOutstandinginterest")
    private BigDecimal totalOutstandingInterest;
    private BigDecimal totalOutstandingPenalty;
    private BigDecimal totalOutstandingLoanFees;
    private DueLoans dueloans;

}
