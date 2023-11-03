package com.elara.bankone.modules.loan.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanByAccountNumberRequest {
    @NotNull
    private String loanAccountNumber;
    private String institutionCode;
}
