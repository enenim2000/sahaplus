package com.elara.bankone.modules.loan_account.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountBalanceRequest2 {
    @NotNull
    private String customerID;
    private String version;
}
