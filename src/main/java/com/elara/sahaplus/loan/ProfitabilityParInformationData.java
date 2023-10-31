package com.elara.sahaplus.loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfitabilityParInformationData {
    @JsonProperty("TotalReportedInterestIncome")
    private BigDecimal totalReportedInterestIncome;

    @JsonProperty("TotalReportedFeeIncome")
    private BigDecimal totalReportedFeeIncome;

    @JsonProperty("TotalSuspendedFeeIncome")
    private BigDecimal totalSuspendedFeeIncome;

    @JsonProperty("TotalRecoveredFeeIncome")
    private BigDecimal totalRecoveredFeeIncome;
}
