package com.elara.sahaplus.recover.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetOutstandingLoanBalancesResponseDto {
    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("LoanFees")
    private BigDecimal loanFees;

    @JsonProperty("OutstandingPrincipal")
    private BigDecimal outstandingPrincipal;

    @JsonProperty("OverdueLoanInterest")
    private BigDecimal overdueLoanInterest;

    @JsonProperty("OutstandingPenalty")
    private BigDecimal outstandingPenalty;
}
