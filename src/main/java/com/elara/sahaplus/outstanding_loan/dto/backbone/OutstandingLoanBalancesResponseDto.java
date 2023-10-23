package com.elara.sahaplus.outstanding_loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanBalancesResponseDto {
    @JsonProperty("PrincipalBalance")
    private String principalBalance;

    @JsonProperty("PrincipalBalance")
    private String pastDuePrincipal;

    @JsonProperty("TotalPrincipalOutstanding")
    private String totalPrincipalOutstanding;

    @JsonProperty("TotalOustandingBalance")
    private String totalOutstandingBalance;
}
