package com.elara.sahaplus.loan_account.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountBalanceRequestDto {
    @NotNull
    private long customerID;
    private String version;
}
