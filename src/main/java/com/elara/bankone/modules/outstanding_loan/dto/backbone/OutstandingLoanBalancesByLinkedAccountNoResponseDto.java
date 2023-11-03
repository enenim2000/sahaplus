package com.elara.bankone.modules.outstanding_loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutstandingLoanBalancesByLinkedAccountNoResponseDto {
    @JsonProperty("OutstandingLoanPrincipalBalance")
    private String outstandingLoanPrincipalBalance;

    @JsonProperty("OutstandingCASABalance")
    private String outstandingCASABalance;
}
