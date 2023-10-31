package com.elara.sahaplus.loan_account.dto.backbone;

import com.elara.sahaplus.loan_account.LoanAccountStatementResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountStatementResponseDto {
    private boolean isSuccessful;

    @JsonProperty("Message")
    private LoanAccountStatementResponseData loanAccountStatementResponseData;
}