package com.elara.bankone.modules.loan_account.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountBalanceRequestDto2 {
    @NotNull
    private String customerID;
    private String version;
}
