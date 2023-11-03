package com.elara.bankone.modules.loan_account.dto.backbone;

import com.elara.bankone.modules.loan_account.LoanAccountBalanceData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountBalanceResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;
    @JsonProperty("Message")
    private LoanAccountBalanceData loanAccountBalanceData;
}
