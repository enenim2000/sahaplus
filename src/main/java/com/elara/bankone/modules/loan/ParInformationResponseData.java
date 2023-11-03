package com.elara.bankone.modules.loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParInformationResponseData {
    @JsonProperty("TotalNumberOfAccounts")
    private long totalNumberOfAccounts;

    @JsonProperty("TotalPrincipal")
    private long totalPrincipal;

    @JsonProperty("TotalOutstandingPrincipal")
    private BigDecimal totalOutstandingPrincipal;

    @JsonProperty("TotalPastDuePrincipal")
    private BigDecimal totalPastDuePrincipal;

    @JsonProperty("TotalPastDueInterest")
    private BigDecimal totalPastDueInterest;

    @JsonProperty("TotalUnpaidLoanFees")
    private BigDecimal totalUnpaidLoanFees;

    @JsonProperty("TotalPrincipalBalance")
    private BigDecimal totalPrincipalBalance;

    @JsonProperty("TotalLedgerBalanceAsAtCurrentDate")
    private BigDecimal totalLedgerBalanceAsAtCurrentDate;
}
